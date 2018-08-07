package com.doongi;

import com.sun.AccessModifier;


public class ProtedeTest {
    public static void main(String[] args){
        AccessModifier am = new AccessModifier();
        System.out.println(am.public_name);

        // 에러
        // System.out.println(am.default_name);
        // 에러
        // System.out.println(am.protected_name);
        // 에러
        // System.out.println(am.private_name);

        AccessModefierChild amc = new AccessModefierChild();
        System.out.println(amc.public_name);

        // protected는 상송받은 클래스에서만 접근 가능하므로
        // 자식 클래스에 인스턴스에서는 접근이 불가능하다.
        // getter를 만들어서 해결 할 수 있다.
        System.out.println(amc.getProtected_name());
        // 에러
        // System.out.println(amc.private_name);
        // 에러
        // System.out.println(amc.default_name);

    }
}
