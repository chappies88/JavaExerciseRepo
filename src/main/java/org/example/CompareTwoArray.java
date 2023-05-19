package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTwoArray {
    public static void main(String[] args) {

        List<String> fruit1 = new ArrayList<>();
        fruit1.add("Banana");
        fruit1.add("Apple");
        fruit1.add("Duran");

        List<String> fruit2 = new ArrayList<>();
        fruit2.add("Banana");
        fruit2.add("Apple");
        fruit2.add("Mango");
        fruit2.add("Duran");

        //Option1
        if(fruit1.containsAll(fruit2)){
            System.out.println("Same List.");
        } else {
            System.out.println("Different List.");
        }

        //Option2
        List<String> compareList = new ArrayList<>();
        for(String f : fruit2){
            compareList.add(fruit1.contains(f)? "Yes" : "No");
        }
        System.out.println(compareList);

        //swap elements in the list
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("green");
        c1.add("blue");
        c1.add("yellow");
        c1.add("blue");
        c1.add("orange");
        System.out.println("elements before swap " + c1);
        Collections.swap(c1, 0, 4);
        System.out.println("elements after swap " + c1);



        ArrayList<String> c2 = new ArrayList<>();
        c2.add("purple");
        c2.add("white");
        c2.add("red");

        c1.addAll(c2);
        System.out.println(c1);

        ArrayList<String> c3 = (ArrayList<String>) c2.clone();
        System.out.println(c3);


        c3.clear();
        c3.add("Jakarta");

        if(c3.isEmpty()){
            System.out.println("c3 is empty");
        } else {
            System.out.printf("c3 is not empty. contain %d elements", c3.size());
        }




    }




}
