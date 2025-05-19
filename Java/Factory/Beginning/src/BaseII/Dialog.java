package BaseII;

import Base.ButtonI;

// Base creator
public abstract class Dialog {
    public void renderWindow() {
        ButtonI okButton = createButton();
        okButton.render();
    }

    public abstract ButtonI createButton();
}
