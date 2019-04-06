package client;

import factory.Factory;
import factory.WindowsFactory;
import product.Button;
import product.Text;

public class Client {
    public static void main(String[] args) {

        Factory factory = new WindowsFactory();
        Button button = factory.createButton();
        Text text = factory.createText();
        button.display();
        text.display();
    }
}