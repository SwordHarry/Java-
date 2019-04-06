package Abstraction;

        import Implementor.ShapeStyle;

public abstract class Shape {

    protected ShapeStyle shapeStyle;

    public abstract void display();

    public void setShapeStyle(ShapeStyle shapeStyle){
        if (shapeStyle != null)
            this.shapeStyle = shapeStyle;
    }

}
