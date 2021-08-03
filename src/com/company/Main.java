package com.company;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //OBJECT PASSING (FILES INVOLVED: GARAGE.JAVA & KOTSE.JAVA)
        Garage garage = new Garage();
        Kotse kotse1 = new Kotse("BMW");
        Kotse kotse2 = new Kotse("Tesla");
        garage.park(kotse1);
        garage.park(kotse2);








        //ARRAY OF OBJECTS
        //Food[] refrigerator = new Food[3]; //1st way of declaring an array of objects.
        Food food1 = new Food("pizza");
        Food food2 = new Food("hotdog");
        Food food3 = new Food("burger");
        Food[] refrigerator = {food1, food2, food3}; //2nd way of declaring an array of objects after defining values.
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
        System.out.println("Your Refrigerator:");
        System.out.println(refrigerator[0].name);

        //OVERLOADED CONSTRUCTORS
        Pizza pizza = new Pizza("Thicc Crust", "Tomato", "Cheese", "olives");
        System.out.println("Your pizza:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


        //PASSING VALUES TO CONSTRUCTORS
        Human human1 = new Human("Jericho", 21, 56);
        Human human2 = new Human("Jed", 11, 40);
        //print out the values from the humans you made.
        System.out.println("Your humans:");
        System.out.println(human1.pangngalan);
        System.out.println(human2.pangngalan);
        human1.eat();
        human2.eat();

        Car myCar = new Car();
        System.out.println("Car model is " + myCar.model);

        //SCANNER EXAMPLE
        /*
         Scanner scanner = new Scanner(System.in);
         System.out.println("What\'s your name?:");
         String name = scanner.nextLine();
         System.out.println("So, you\'re " + name.toString() + " huh?");
        */


        //ARRAY EXAMPLE
        /*
        String[] cars = new String[3];
        cars[0] = "Nissan";
        cars[1] = "Audi";
        cars[2] = "BMW";
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        */


        //GUI & SWITCH EXAMPLE
        /*
        String gender = JOptionPane.showInputDialog("Enter your gender (M or F)");
        switch (gender){
            case "M":
                JOptionPane.showMessageDialog(null, "Great, you\'re a male");
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "You\'re a Female, omg");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Uhh, what is your gender?");
        }
         */

        //2D ARRAY
        /*
        String[][] cars = {
                {"Nissan", "BMW", "Audi"},
                {"Hyundai", "Toyota", "Mitsubishi"},
                {"Tesla", "EA", "idk"}
        };
        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }
         */

        //ARRAYLIST
        /*
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.set(0, "sushi");
        food.remove(0);
        food.clear();
         */

        //2D-ARRAYLIST
        /*
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");
        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("juice");
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList); //print out everything
        System.out.println(groceryList.get(0)); //print out first list
        System.out.println(groceryList.get(0).get(0)); //print out first data in the first list.
         */

        //CALL A METHOD
        /*
        String me = "Jericho";
        int age = 21;
        hello(me, age); //a method that returns nothing
        int x = 5;
        int y = 5;
        System.out.println("x + y is: " + add(x,y)); //a method that returns a value
         */

    }//class ends here



    static void hello(String me, int age){
        System.out.println("Hello there " + me + " You're age is: " + age);
    }
    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}//Main class ends here
