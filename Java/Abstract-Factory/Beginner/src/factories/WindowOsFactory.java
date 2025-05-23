package factories;

import buttons.Button;
import buttons.MacButton;
import buttons.WindowButton;
import checkboxes.CheckBox;
import checkboxes.WindowCheckBox;

public class WindowOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
