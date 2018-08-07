package com.sun;

public class Java9Application {
    public static void main(String args[]){
        System.out.println("Hello World");

        AccessModifier am = new AccessModifier();
        System.out.println(am.public_name);
        System.out.println(am.default_name);
        System.out.println(am.protected_name);

        // 에러
        // System.out.println(am.private_name);

    }
}
