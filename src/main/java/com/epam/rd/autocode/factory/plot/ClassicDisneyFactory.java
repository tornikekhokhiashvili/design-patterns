package com.epam.rd.autocode.factory.plot;

public class ClassicDisneyFactory implements PlotFactory{
    private Character hero;
    private Character beloved;
    private Character villain;

    public ClassicDisneyFactory(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
    }
    @Override
    public Plot plot() {
        return new ClassicDisneyPlot(hero, beloved, villain);
    }
}
