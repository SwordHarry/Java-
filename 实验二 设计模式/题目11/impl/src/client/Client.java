package client;

import factory.AbstractFactory;
import product.AbstractMap;
import product.AbstractSound;
import product.AbstractWeather;
import util.XMLUtil;

public class Client {
    public static void main(String[] args){
        AbstractFactory factory = (AbstractFactory) XMLUtil.getBean();
        if(factory != null){
            AbstractMap map = factory.createMap();
            AbstractSound sound = factory.createSound();
            AbstractWeather weather = factory.createWeather();

            map.display();
            sound.play();
            weather.display();
        }

    }
}