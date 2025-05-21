package adaptee;

import interfaces.AdvancedMediaPlayer;

public class MP4player implements AdvancedMediaPlayer  {
    @Override
    public void playVLC(String vlcFile) throws IllegalAccessException {
        throw new IllegalAccessException("Cannot play VLC for MP4 player");
    }

    @Override
    public void playMP4(String mp4File) {
        System.out.println("Playing mp4 file : " + mp4File);
    }
}
