package factories;

import buttons.Button;
import buttons.MacButton;
import checkboxes.CheckBox;
import checkboxes.MacCheckBox;
import checkboxes.WindowCheckBox;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
