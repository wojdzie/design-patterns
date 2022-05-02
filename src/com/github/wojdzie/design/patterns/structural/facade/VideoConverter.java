package com.github.wojdzie.design.patterns.structural.facade;

import java.io.File;

public class VideoConverter {

    File convertVideo(String fileName, String format) {
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        return (new AudioMixer()).fix(intermediateResult);
    }
}
