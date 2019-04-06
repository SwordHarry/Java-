package ConcreteImplementor;

import Implementor.ShapeStyle;

public class TwoDGraphic implements ShapeStyle {
    @Override
    public void displayStyle() {
        System.out.println("显示平面图形");
    }
}
