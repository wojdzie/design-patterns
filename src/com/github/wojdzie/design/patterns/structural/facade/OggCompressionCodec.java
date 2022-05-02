package com.github.wojdzie.design.patterns.structural.facade;

public class OggCompressionCodec implements Codec {

    @Override
    public String getCodec() {
        return "ogg";
    }
}
