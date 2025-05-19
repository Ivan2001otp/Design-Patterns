package ConcreteII;

import Base.ButtonI;
import BaseII.Dialog;
import Concrete.ElevatedButton;

public class StyledDialogBox extends Dialog {
    @Override
    public ButtonI createButton() {
        return new ElevatedButton();
    }
}
