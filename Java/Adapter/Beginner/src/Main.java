import client.AudioPlayer;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "songB.mp4");
        audioPlayer.play("vlc", "songC.vlc");
        audioPlayer.play("avi", "songD.avi");

    }
}