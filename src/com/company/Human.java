package com.company;

//---------------------------CONSTRUCTOR EXAMPLE
public class Human { //values within this class
    String pangngalan;
    int edad;
    double bigat;

    Human(String name, int age, double weight){ //constructor
        this.pangngalan = name + " Heh";
        this.edad = age;
        this.bigat = weight;
    }

    void eat(){
        System.out.println(this.pangngalan + " is eating");
    }

}
