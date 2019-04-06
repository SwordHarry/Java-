package factory.impl;

import factory.AbstractFactory;
import product.AbstractMap;
import product.AbstractSound;
import product.AbstractWeather;
import product.impl.SummerMap;
import product.impl.SummerSound;
import product.impl.SummerWeather;

public class SummerFactory implements AbstractFactory {

   public AbstractMap createMap() {
      return new SummerMap();
   }
   

   public AbstractWeather createWeather() {
      return new SummerWeather();
   }
   

   public AbstractSound createSound() {
      return new SummerSound();
   }

}