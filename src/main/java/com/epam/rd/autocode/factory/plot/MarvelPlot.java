package com.epam.rd.autocode.factory.plot;

public class MarvelPlot implements Plot{
    private String heroes = "";
    private String epicCrisis;
    private String villain;

    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        StringBuilder str = new StringBuilder();
        for (Character hero: heroes) {
            str.append(" brave " + hero.name() + ",");
        }
        this.heroes = str.substring(0, str.length() - 1);
        this.epicCrisis = epicCrisis.name();
        this.villain = villain.name();
    }

    @Override
    public String toString() {
        return (String.format("%s threatens the world. But%s on guard. So, no way that intrigues of %s " +
                "overcome the willpower of inflexible heroes", epicCrisis, heroes, villain));
    }
}
