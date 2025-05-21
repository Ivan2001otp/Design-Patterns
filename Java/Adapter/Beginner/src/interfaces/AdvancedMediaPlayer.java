package interfaces;

public interface AdvancedMediaPlayer {
    void playVLC(String vlcFile) throws IllegalAccessException;
    void playMP4(String mp4File) throws IllegalAccessException;
}
