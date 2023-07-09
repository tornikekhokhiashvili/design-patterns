package com.epam.rd.autocode.factory.plot;

public class ModernDisneyPlot implements Plot{
    private String hero;
    private String epicCrisis;
    private String funnyFriend;

    public ModernDisneyPlot(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero.name();
        this.epicCrisis = epicCrisis.name();
        this.funnyFriend = funnyFriend.name();
    }

    @Override
    public String toString() {
        return (String.format("%s feels a bit awkward and uncomfortable. But personal issues fades, when " +
                        "a big trouble comes - %s. %s stands up against it, but with no success at first." +
                        "But putting self together and help of friends, including spectacular funny %s " +
                        "restore the spirit and %s overcomes the crisis and gains gratitude and respect",
                hero, epicCrisis, hero, funnyFriend, hero));

    }
}
