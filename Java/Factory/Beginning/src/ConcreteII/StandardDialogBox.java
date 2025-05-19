package ConcreteII;

import Base.ButtonI;
import BaseII.Dialog;
import Concrete.RadioButton;

public class StandardDialogBox extends Dialog{
    @Override
    public ButtonI createButton() {
        return new RadioButton();
    }
}
