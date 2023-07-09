package com.epam.rd.autocode.factory.plot;

public class MarvelFactory implements PlotFactory{
    private Character[] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;

    public MarvelFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public Plot plot() {
        return new MarvelPlot(heroes, epicCrisis, villain);
    }
}
