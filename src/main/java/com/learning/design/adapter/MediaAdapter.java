package com.learning.design.adapter;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer = new VLCPlayer();
        }else if(audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("VLC")){
            advancedMediaPlayer.playVLC(fileName);
        }else if(audioType.equalsIgnoreCase("MP4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
