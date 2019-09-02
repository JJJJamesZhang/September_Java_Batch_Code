package com.ss.class1;


//polymorphism
class Animal{
    public void run(){
        System.out.println("animal run");
    }
}

class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dog run");
    }
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("cat run");
    }
}

public class OopTopic {


    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.run();
        cat.run();
    }
}
