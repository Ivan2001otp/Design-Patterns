package MediaLibrary;

public class VideoFile {
    private String fileName;
    private String codecType;

    public VideoFile(String name) {
        this.fileName = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return fileName;
    }
}
