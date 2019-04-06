/***********************************************************************
 * Module:  Circle.java
 * Author:  ASUS
 * Purpose: Defines the Class Circle
 ***********************************************************************/

import java.util.*;

/** @pdOid e0d30f25-55d9-441b-84ff-1c4e7959e548 */
public class Circle extends Shape {
   /** @pdOid d3499ee7-0f65-4605-8ac4-20a11c02480d */
   private double radius;
   
   /** @pdOid 97665cf6-ca2b-40f3-8360-493c9afde07e */
   public double getRadius() {
      return radius;
   }
   
   /** @param newRadius
    * @pdOid 2e1afe76-6d6f-4f32-9456-afdbb1b6768b */
   public void setRadius(double newRadius) {
      radius = newRadius;
   }
   
   /** @pdOid 40976cba-a4d5-4b9f-895a-b87c4a63a00c */
   public void draw() {
      // TODO: implement
   }

}