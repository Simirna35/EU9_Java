package day28_ArrayList;


import javax.swing.*;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>() ;
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);

        System.out.println("**************************");

        ArrayList<String> ilan = new ArrayList<>();

       ilan.add("I");
       ilan.add("Love");
       ilan.add("You");
       ilan.add("My heart");

        System.out.println(ilan);


    }


}

