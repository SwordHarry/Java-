package factory.impl;

import factory.AbstractFactory;
import product.AbstractMap;
import product.AbstractSound;
import product.AbstractWeather;
import product.impl.SpringMap;
import product.impl.SpringSound;
import product.impl.SpringWeather;
import product.impl.SummerSound;


public class SpringFactory implements AbstractFactory {

   public AbstractMap createMap() {
      // TODO: implement
      return new SpringMap();
   }
   

   public AbstractWeather createWeather() {
      // TODO: implement
      return new SpringWeather();
   }
   

   public AbstractSound createSound() {
      // TODO: implement
      return new SpringSound();
   }

}