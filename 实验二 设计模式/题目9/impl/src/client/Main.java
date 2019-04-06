package client;

import component.baseComponent.BaseComponent;
import component.baseComponent.CButton;
import component.baseComponent.CTextField;
import component.containerComponent.CFrame;
import component.containerComponent.CPanel;
import component.containerComponent.ContainerComponent;

public class Main {

    public static void main(String[] args) {

        ContainerComponent containerComponent = new CFrame();
        ContainerComponent panel = new CPanel();
        BaseComponent button = new CButton();
        BaseComponent textField = new CTextField();
        containerComponent.addComponent(panel);
        panel.addComponent(button);
        panel.addComponent(textField);
        containerComponent.display();
    }
}
