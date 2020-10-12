package com.company;

public class Dog {
    String name;
    boolean isCollar;
    boolean isLeash;
    boolean isMuzzle;

    public Dog(String name) {
        this.name = name;
    }


    public void putCollar() {

        System.out.println("Ошейник надет!");
        this.isCollar = true;
    }

    public void putLeash() {

        System.out.println("Поводок надет!");
        this.isLeash = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzle = true;
    }

    public void walk() throws DogException {


        if (isCollar && isLeash && isMuzzle) {
            System.out.println("Идем гулять: " + name + "!");
        } else {
            throw new DogException("Собака " + name + " не готова!");
        }
    }
}
