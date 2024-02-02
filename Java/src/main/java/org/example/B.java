package org.example;

public class B  {

    //Field name written anywhre ?
    public B(){
        System.out.println("Inside Constructor of B");
    }

    //Prints the name
    public void getName(A a){

        System.out.println(a.getName());
    }

    //Sets the name to XYZ
    public void setName(A a){
        a.setName("XYZ");
    }
}
