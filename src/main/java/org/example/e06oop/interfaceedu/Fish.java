package org.example.e06oop.interfaceedu;

abstract class Fish implements Swim {
    protected String name;
    protected String residence;

    Fish(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    abstract String residence();

    public String birth() {
        return String.format("%s이/가 알을 낳습니다.", this.name);
    }

    public String swimming() {
        return String.format("%s이/가 헤엄칩니다.", this.name);
    }
}
