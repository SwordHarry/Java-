package RefinedAbstraction;

import Abstraction.Shape;

public class Triangle extends Shape {
    @Override
    public void display() {
        this.shapeStyle.displayStyle();
        System.out.println("显示三角形");
    }
}
