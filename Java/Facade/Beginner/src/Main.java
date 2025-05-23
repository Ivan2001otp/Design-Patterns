import facade.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4Video = conversionFacade.convertVideo("dsaf.ogg", "mp4");
    }
}