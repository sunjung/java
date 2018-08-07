package com.doongi;

import com.sun.AccessModifier;

public class AccessModefierChild extends AccessModifier {

    public AccessModefierChild(){
        super();
    }

    public String getProtected_name() {
        return protected_name;
    }

    public void setProtected_name(String protected_name) {
        this.protected_name = protected_name;
    }
}
