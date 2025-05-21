package adaptee;

import interfaces.AdvanceSnapshotViewer;

import java.io.File;

public class WebpImageViewer implements AdvanceSnapshotViewer {
    @Override
    public void displayImageformatWebP(String fileName)  {
        File file = new File(fileName);
        System.out.println("Displaying WebP image format : "+fileName);
    }

    @Override
    public void displayImageformatGif(String fileName) throws IllegalAccessException {
        throw new IllegalAccessException("Cannot use GIF image format .");
    }
}
