package ConcreteImplementor;

import Implementor.ShapeStyle;

public class ThreeDGraphic implements ShapeStyle {
    @Override
    public void displayStyle() {
        System.out.println("显示立体图形");
    }
}
