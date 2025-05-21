package adaptee;

import interfaces.AdvancedMediaPlayer;

public class VLCplayer implements AdvancedMediaPlayer  {
    @Override
    public void playVLC(String vlcFile) throws IllegalAccessException {
        System.out.println("Playing VLC file : "+vlcFile);
    }

    @Override
    public void playMP4(String mp4File) throws IllegalAccessException {
        throw new IllegalAccessException("Cannot play MP4 for VLC player");
    }
}
