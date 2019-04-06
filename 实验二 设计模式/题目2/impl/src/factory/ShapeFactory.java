package factory;

import product.Circle;
import product.Rectangle;
import product.Shape;
import product.Triangle;

public class ShapeFactory {

   public static Shape createShape(String type) throws Exception {
      Shape shape = null;

      if (type.equalsIgnoreCase("circle")){
         shape = new Circle();
      } else if (type.equalsIgnoreCase("triangle")) {
         shape = new Triangle();
      } else if (type.equalsIgnoreCase("rectangle")) {
         shape = new Rectangle();
      } else {
         throw new Exception("UnsupportedShapeException");
      }

      return shape;
   }

}