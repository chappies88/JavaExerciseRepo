package org.example;

import java.util.ArrayList;
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





    }
}
