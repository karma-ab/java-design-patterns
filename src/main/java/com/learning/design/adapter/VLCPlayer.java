package com.learning.design.adapter;

public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file. Name : "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

        //nothing
    }
}
