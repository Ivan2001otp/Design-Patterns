package editor;

import publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;//publisher
    private File file;

    public Editor() {
        events = new EventManager("open", "save");// subscribe to these events.
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", this.file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", this.file);
        } else {
            throw new Exception("Please open the file first");
        }
    }

}
