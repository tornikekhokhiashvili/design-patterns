package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyPlot implements Plot{
    private String hero;
    private String beloved;
    private String villain;

    public ClassicDisneyPlot(Character hero, Character beloved, Character villain) {
        this.hero = hero.name();
        this.beloved = beloved.name();
        this.villain = villain.name();
    }

    @Override
    public String toString() {
        return (String.format("%s is great. %s and %s love each other. %s interferes with their happiness" +
                " but loses in the end.", hero, hero, beloved, villain));
    }
}
