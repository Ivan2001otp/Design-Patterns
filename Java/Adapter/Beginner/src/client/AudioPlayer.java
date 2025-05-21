package client;

import adapter.MediaAdapter;
import interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String mediaFileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file : "+mediaFileName);
        } else if (
                audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")
        ) {
            // magic of adapter
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, mediaFileName);

        } else {
            System.out.println("Invalid media file type "+ audioType);
            System.out.println(mediaFileName);
        }
    }
}
