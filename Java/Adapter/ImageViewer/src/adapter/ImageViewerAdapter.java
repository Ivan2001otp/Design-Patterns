package adapter;

import adaptee.GifImageViewer;
import adaptee.WebpImageViewer;
import interfaces.AdvanceSnapshotViewer;
import interfaces.SnapshotViewer;


public class ImageViewerAdapter implements SnapshotViewer {
    private AdvanceSnapshotViewer advanceSnapshotViewer;

    public ImageViewerAdapter(String imageType) {
        if (imageType.equalsIgnoreCase("webp")) {
            advanceSnapshotViewer = new WebpImageViewer();
        } else if (imageType.equalsIgnoreCase("gif")) {
            advanceSnapshotViewer = new GifImageViewer();
        }
    }


    @Override
    public void display(String imageType, String fileName) {
       try {
           if (imageType.equalsIgnoreCase("webp")) {
                advanceSnapshotViewer.displayImageformatWebP(fileName);
           }else if (imageType.equalsIgnoreCase("gif")) {
                advanceSnapshotViewer.displayImageformatGif(fileName);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
