package Client;

import Abstraction.Shape;
import Implementor.ShapeStyle;
import util.XMLUtil;

public class Main {
    // 桥接模式实现 图形和图形样式的解耦合
    public static void main(String[] args) {
        Shape shape = (Shape)XMLUtil.getBean("image");
        ShapeStyle shapeStyle = (ShapeStyle) XMLUtil.getBean("os");
        shape.setShapeStyle(shapeStyle);
        shape.display();
    }
}
