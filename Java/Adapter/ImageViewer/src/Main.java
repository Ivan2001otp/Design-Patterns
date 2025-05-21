import client.ImageViewer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ImageViewer imageViewer = new ImageViewer();
        imageViewer.display("png","myimg.png");
        imageViewer.display("jpg", "img2.jpg");
        imageViewer.display("webp", "img3.webp");
        imageViewer.display("gif", "img4.gif");
        imageViewer.display("eps", "book.eps");
    }
}