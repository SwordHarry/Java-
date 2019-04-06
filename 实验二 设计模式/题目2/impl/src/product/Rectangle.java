package product;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }

    @Override
    public void erase() {
        System.out.println("擦除矩形");
    }
}