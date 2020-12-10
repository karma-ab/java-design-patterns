package com.learning.design.adapter;

public class AudioPlayer  implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name : "+fileName);
        }

        else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else {
            System.out.println("Media Format not supported");
        }
    }
}
