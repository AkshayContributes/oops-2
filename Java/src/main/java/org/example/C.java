package org.example;

public class C{
    public C(){
        System.out.println("Inside the constructor of C");
    }
    public static void main(String[] args) {
       B b = new B();
       A a = new A();


       //it sets the name to ABC
       a.setName("ABC");


       System.out.println(a.getName());//ABC

       //set the name to XYZ
       b.setName(a);
       //Prints the name
       b.getName(a); //XYZ
    }
}
