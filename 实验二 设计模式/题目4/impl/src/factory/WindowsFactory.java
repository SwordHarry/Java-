package factory;

import product.Button;
import product.Text;
import product.WindowsButton;
import product.WindowsText;

public class WindowsFactory implements Factory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        return new WindowsText();
    }
}