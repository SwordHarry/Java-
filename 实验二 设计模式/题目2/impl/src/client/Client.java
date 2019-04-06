package client;
import factory.ShapeFactory;
import product.Shape;

public class Client {
    public static void main(String[] args) {
        try {
            Shape shape = ShapeFactory.createShape("haha");
            shape.draw();
            shape.erase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}