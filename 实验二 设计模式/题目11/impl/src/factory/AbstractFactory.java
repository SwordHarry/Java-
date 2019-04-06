package factory;

import product.AbstractMap;
import product.AbstractSound;
import product.AbstractWeather;


public interface AbstractFactory {

   AbstractMap createMap();

   AbstractWeather createWeather();

   AbstractSound createSound();

}