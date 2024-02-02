package org.example;

import java.util.UUID;

public class A {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name != null && this.name.equals("ABC")){
            return;
        }
        //If request comes from B, decline it.
        this.name = name;
    }

    public A(){
        System.out.println("Inside constructor of A");
    }
}
