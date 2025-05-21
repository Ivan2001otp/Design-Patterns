package client;

import adapter.ImageViewerAdapter;
import interfaces.SnapshotViewer;

public class ImageViewer implements SnapshotViewer {

    ImageViewerAdapter adapter;

    @Override
    public void display(String imageType, String fileName) {
        if ( imageType.equalsIgnoreCase("png") || imageType.equalsIgnoreCase("jpg")) {
            if (imageType == "png") {
                System.out.println("Viewing Png image");
            } else {
                System.out.println("Viewing jpg image");
            }
        } else if (imageType.equalsIgnoreCase("webp") || imageType.equalsIgnoreCase("gif")) {
            adapter = new ImageViewerAdapter(imageType);
            adapter.display(imageType, fileName);
        } else {
            System.out.println("Invalid image format . Cannot view . " + imageType);
        }
    }
}
