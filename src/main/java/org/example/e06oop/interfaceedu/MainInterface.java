package org.example.e06oop.interfaceedu;

public class MainInterface {
    public static void main(String[] args) {
        FlyingFish flyingfish = new FlyingFish();
        System.out.println(flyingfish.flying());

        Whale whale = new Whale();
        System.out.println(whale.residence());

        Fish fish = new FlyingFish();
        Flight flight = new FlyingFish();
        Swim swim = new FlyingFish();


    }
}
