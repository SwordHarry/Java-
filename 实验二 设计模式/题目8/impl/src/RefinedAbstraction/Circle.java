package RefinedAbstraction;

import Abstraction.Shape;

public class Circle extends Shape {
    @Override
    public void display() {
        this.shapeStyle.displayStyle();
        System.out.println("显示圆形");
    }
}
