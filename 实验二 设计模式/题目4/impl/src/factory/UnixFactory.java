package factory;

import product.Button;
import product.Text;
import product.UnixButton;
import product.UnixText;

public class UnixFactory implements Factory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }
}