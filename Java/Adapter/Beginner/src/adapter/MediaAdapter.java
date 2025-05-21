package adapter;

import adaptee.MP4player;
import adaptee.VLCplayer;
import interfaces.AdvancedMediaPlayer;
import interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VLCplayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4player();
        }
    }



    @Override
    public void play(String audioType, String mediaFileName) {
        try {

            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMediaPlayer.playVLC(mediaFileName);
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMediaPlayer.playMP4(mediaFileName);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
