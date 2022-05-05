package com.github.wojdzie.design.patterns.behavioral.state;

public abstract class State {

    protected final AudioPlayer player;

    protected State(AudioPlayer player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
