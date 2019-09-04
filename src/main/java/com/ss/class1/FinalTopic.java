package com.ss.class1;

public class FinalTopic {

    //final value cannot be changed
    final int val = 1;
    //final reference cannot be changed
    final FinalTopic ft = new FinalTopic();

    //final method cannot be override
    public final void finalMethod(){

    }

    //how to write a final class
    //final class
    //private final variable
    //constructor parameterize
    //only getter no setter method
    public final class Student {
        private final int id;
        private final String name;

        public Student (int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    //final finally finalize

}
