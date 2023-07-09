package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;

public class Repos implements Repository{
    private List<WebHook> observes = new ArrayList<>();

    @Override
    public void addWebHook(WebHook webHook) {
        observes.add(webHook);
    }

    @Override
    public Commit commit(String branch, String author, String[] changes) {
        Commit commit = new Commit(author, changes);
        List<Commit> commits = new ArrayList<>();
        commits.add(commit);
        Event event = new Event(Event.Type.COMMIT, branch, commits);
        for (WebHook observer : observes) {
            if (branch.equals(observer.branch()) && observer.type() == Event.Type.COMMIT) {
                observer.onEvent(event);
            }
        }
        return commit;
    }

    @Override
    public void merge(String sourceBranch, String targetBranch) {
        List<Event> events = new ArrayList<>();
        for (WebHook observe: observes) {
            if (observe.branch().equals(sourceBranch) && observe.type() == Event.Type.COMMIT) {
                events = observe.caughtEvents();
            }
        }
        List<Commit> commits = new ArrayList<>();
        for (Event event : events) {
            commits.addAll(event.commits());
        }
        Event mergeEvent = new Event(Event.Type.COMMIT, "branch", commits);
        for (WebHook observe: observes) {
            if (observe.branch().equals(targetBranch) && observe.type() == Event.Type.MERGE) {
                if (!observe.caughtEvents().contains(mergeEvent)) {
                    observe.onEvent(mergeEvent);
                }
            }
        }
    }
}
