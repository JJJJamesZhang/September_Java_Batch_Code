package com.ss.class2;

import java.util.*;

//class Student implements Comparable<Student>{
////    Integer id;
////
////    public Student(Integer id){
////        this.id = id;
////    }
////
////    @Override
////    public int compareTo(Student o) {
////        return this.id - o.id;
////    }
////}
class Student {
    Integer id;

    String firstName;
    String lastName;

    public Student(Integer id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.id - o.id;
//    }
}

public class CollectionTopic {



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "san", "zhang"));
        students.add(new Student(1, "si","li"));
        students.add(new Student(4,"wu","wang"));
        students.add(new Student(3,"liu","zhao"));

        //Collections.sort(students);
        //System.out.println(students);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // -1 , 0 ,1
                if (!o1.firstName.equals(o2.firstName)){
                    return o1.firstName.compareTo(o2.firstName);
                }else {
                    return o1.lastName.compareTo(o2.lastName);
                }

            }
        });


        System.out.println(students);

//        for (Student student : students){
//            if (student.id == 2){
//                students.remove(2);
//            }
//            System.out.println(student.id);
//        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.id == 2){
                iterator.remove();
            }
            System.out.println(student.id);

        }

        System.out.println(students);

    }
}
