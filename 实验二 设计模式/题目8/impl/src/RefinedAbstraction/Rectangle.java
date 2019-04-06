package RefinedAbstraction;

import Abstraction.Shape;

public class Rectangle extends Shape {
    @Override
    public void display() {
        this.shapeStyle.displayStyle();
        System.out.println("显示矩形");
    }
}
