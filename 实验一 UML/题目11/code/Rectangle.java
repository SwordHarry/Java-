/***********************************************************************
 * Module:  Rectangle.java
 * Author:  ASUS
 * Purpose: Defines the Class Rectangle
 ***********************************************************************/

import java.util.*;

/** @pdOid 883bfc9e-5aff-4fb3-9d6b-df8e4172f4fc */
public class Rectangle extends Shape {
   /** @pdOid 211dd7f3-11af-4f36-a3c5-7b2a476dda39 */
   private double height;
   /** @pdOid 4ddd6c32-3239-4b29-9c1f-6e6605ec9bef */
   private double width;
   
   /** @pdOid 7f20d532-c0a7-40ad-a2f8-6ab3fca65db4 */
   public double getWidth() {
      return width;
   }
   
   /** @param newWidth
    * @pdOid 1a6f1b7b-87ee-445f-b715-7288f7ed629d */
   public void setWidth(double newWidth) {
      width = newWidth;
   }
   
   /** @pdOid 047b56f6-3869-42af-bd68-237fa369a4f7 */
   public double getHeight() {
      return height;
   }
   
   /** @param newHeight
    * @pdOid a2351569-b9f5-48b0-9b9c-99c093a5c22c */
   public void setHeight(double newHeight) {
      height = newHeight;
   }
   
   /** @pdOid adfe2f07-efb1-46f9-bd46-e8cdfa4545b0 */
   public void draw() {
      // TODO: implement
   }

}