package com.epam.rd.autocode.observer.git;

import java.util.ArrayList;
import java.util.List;

public class CommitObserver implements WebHook{
    String branchName;
    List<Event> eventList = new ArrayList<>();

    public CommitObserver(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String branch() {
        return branchName;
    }

    @Override
    public Event.Type type() {
        return Event.Type.COMMIT;
    }

    @Override
    public List<Event> caughtEvents() {
        return eventList;
    }

    @Override
    public void onEvent(Event event) {
        eventList.add(event);
    }
}
