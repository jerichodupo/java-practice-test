package com.company;

//----------------------OVERLOADED CONSTRUCTORS EXAMPLE
public class Pizza {
    String bread, sauce, cheese, topping;

    //constructor version 1
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

    //constructor version 2
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    //constructor version 3
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
