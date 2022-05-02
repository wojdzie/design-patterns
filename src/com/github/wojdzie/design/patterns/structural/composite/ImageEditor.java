package com.github.wojdzie.design.patterns.structural.composite;

public class ImageEditor {

    private final CompoundGraphic compoundGraphic;

    public ImageEditor(CompoundGraphic compoundGraphic) {
        this.compoundGraphic = compoundGraphic;
    }

    void load(Graphic...components) {
        compoundGraphic.add(components);
    }

    void groupSelected(Graphic...components) {
        CompoundGraphic group = new CompoundGraphic();
        group.add(components);

        compoundGraphic.remove(components);
        compoundGraphic.add(group);
        compoundGraphic.draw();

    }
}
