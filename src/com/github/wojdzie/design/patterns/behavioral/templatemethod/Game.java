package com.github.wojdzie.design.patterns.behavioral.templatemethod;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
