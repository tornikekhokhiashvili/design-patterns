package com.epam.rd.autocode.factory.plot;

class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        if (hero == null || beloved == null || villain == null) {
            throw new UnsupportedOperationException();
        }
        return new ClassicDisneyFactory(hero, beloved, villain);
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        if (hero == null || epicCrisis == null || funnyFriend == null) {
            throw new UnsupportedOperationException();
        }
        return new ModernDisneyFactory(hero, epicCrisis, funnyFriend);
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        if (heroes == null || epicCrisis == null || villain == null) {
            throw new UnsupportedOperationException();
        }
        return new MarvelFactory(heroes, epicCrisis, villain);
    }
}
