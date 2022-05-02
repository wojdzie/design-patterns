package com.github.wojdzie.design.patterns.structural.facade;

public class MPEG4CompressionCodec implements Codec {

    @Override
    public String getCodec() {
        return "mp4";
    }
}
