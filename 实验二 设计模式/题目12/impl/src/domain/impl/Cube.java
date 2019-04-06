package domain.impl;

import domain.GameObject;

public class Cube extends GameObject {

   public void display() {
      System.out.println("展示"+this.colorType+"的立方体");
   }

}