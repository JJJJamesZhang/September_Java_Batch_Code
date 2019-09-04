package com.ss.class2;

class Singleton{
    private static Singleton singleton;

    //private constructor
    private Singleton() {}

    //get instance method syn keywords
    public static synchronized Singleton getInstance(){
        if (singleton != null){
            return new Singleton();
        }
        return singleton;
    }

    //override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

//ENUM
enum SingletonEnum{
    INSTANCE;
    private SingletonEnum() {

    }
}


public class DesignPatternTopic {
}
