package com.godOfJava1.c9;

public class AccessCall {
    public static void main(String[] args){
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.packagePritaveMethod();
        // accessModifier.privateMethod();
    }
}
