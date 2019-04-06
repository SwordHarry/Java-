package factory;

import product.Button;
import product.LinuxButton;
import product.LinuxText;
import product.Text;

public class LinuxFactory implements Factory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Text createText() {
        return new LinuxText();
    }
}