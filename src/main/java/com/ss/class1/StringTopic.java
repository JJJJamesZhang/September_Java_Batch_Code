package com.ss.class1;

public class StringTopic {

    StringBuilder stringBuilder = new StringBuilder("");
    StringBuffer stringBuffer = new StringBuffer("");

    public static void main(String[] args) throws InterruptedException {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = str1;
        String str5 = "ab" + "c";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str5);


        //change str1 value
        //String immutable
        str1 = str1 + 'd';
        System.out.println(str4);

        //StringBuilder and StringBuffer mutable
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1);
        System.out.println(sb2);

        //StringBuilder non thread safe
        //StringBuffer thread safe
        System.out.println(new StringTopic());
    }


}
