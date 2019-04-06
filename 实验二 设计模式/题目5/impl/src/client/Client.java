package client;

import multiton.Multiton;

public class Client {

    public static void main(String[] args) {
        Multiton.setLength(1);
        Multiton multiton1 = Multiton.getInstance();
        Multiton multiton2 = Multiton.getInstance();
        Multiton multiton3 = Multiton.getInstance();
        Multiton multiton4 = Multiton.getInstance();

        System.out.println(multiton1 == multiton4 && multiton1 == multiton2 && multiton1 == multiton3);
    }
}
