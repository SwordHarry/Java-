package product;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}