package adaptee;

import interfaces.AdvanceSnapshotViewer;

import java.io.File;

public class GifImageViewer implements AdvanceSnapshotViewer {
    @Override
    public void displayImageformatWebP(String fileName) throws IllegalAccessException {
        throw new IllegalAccessException("Cannot use WEBP format image");
    }

    @Override
    public void displayImageformatGif(String fileName) {
        File file = new File(fileName);
        System.out.println("Displaying GIF image : " + fileName);
    }
}
