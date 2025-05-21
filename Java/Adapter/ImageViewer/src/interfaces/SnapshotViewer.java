package interfaces;

public interface SnapshotViewer {
    //by default have ability to view .png and .jpg images only
    public void display(String imageType, String fileName);
}
