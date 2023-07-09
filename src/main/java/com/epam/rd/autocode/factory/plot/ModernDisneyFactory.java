package com.epam.rd.autocode.factory.plot;

public class ModernDisneyFactory implements PlotFactory{
    private Character hero;
    private EpicCrisis epicCrisis;
    private Character funnyFriend;

    public ModernDisneyFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public Plot plot() {
        return new ModernDisneyPlot(hero, epicCrisis, funnyFriend);
    }
}
