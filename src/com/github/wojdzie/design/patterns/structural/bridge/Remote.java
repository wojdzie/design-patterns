package com.github.wojdzie.design.patterns.structural.bridge;

public class Remote {

    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    void volumeDown() {
        int currentVolume = device.getVolume();
        int volume = currentVolume >= 10 ? currentVolume - 10 : 0;
        device.setVolume(volume);
    }

    void volumeUp() {
        int currentVolume = device.getVolume();
        int volume = currentVolume == 100 ? 100 : currentVolume + 10;
        device.setVolume(volume);
    }
    void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
    void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
