/***********************************************************************
 * Module:  Ellipse.java
 * Author:  ASUS
 * Purpose: Defines the Class Ellipse
 ***********************************************************************/

import java.util.*;

/** @pdOid 233c8b44-1ee4-4253-912e-42517f04eed2 */
public class Ellipse extends Shape {
   /** @pdOid a7081d25-cd5a-40bf-b771-5fa194b0922a */
   private double a;
   /** @pdOid 09fce7f6-798c-4343-a534-936577eeb036 */
   private double b;
   
   /** @pdOid 45251e41-1b6d-4f71-b5d4-7998d11cfed9 */
   public double getA() {
      return a;
   }
   
   /** @param newA
    * @pdOid 776bd887-9315-426c-be81-f1e27ae63dd9 */
   public void setA(double newA) {
      a = newA;
   }
   
   /** @pdOid 078a20e4-e93f-4b61-8398-ce9f7594cf86 */
   public double getB() {
      return b;
   }
   
   /** @param newB
    * @pdOid 6d4aa7dd-616d-4564-a91d-d7f9542351b9 */
   public void setB(double newB) {
      b = newB;
   }
   
   /** @pdOid 50ee32dc-4aa4-4310-8c2f-7f2556617f9b */
   public void draw() {
      // TODO: implement
   }

}