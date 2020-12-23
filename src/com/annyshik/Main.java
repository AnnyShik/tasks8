package com.annyshik;

class Dog {
    public String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String paw;
    public Paw(String paw) {
        this.paw = paw;
    }

    public String sayVoice;
    public void Voice(String sayVoice) {
        this.sayVoice = sayVoice;
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");

        Paw givePaw = new Paw("подал лапу");
        Voice castVoice = new Voice("Гав!");

        System.out.println(dog.name + " " + givePaw.paw);
        System.out.println(castVoice.sayVoice);
    }
}
