package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("1.Create array color and print out.");
        List<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Black");
        color.add("Purple");
        System.out.println(color);

        //2. iterate through list
        System.out.println("\n2.Iterate through color Array:");
        for(String c : color){
            System.out.println(c);
        }

        //3- add item at first index
        System.out.println("\n3.Add item to first index");
        addItemToArrayAtFirst("Green", color);
        printArray(color);

        //4. retrieve item from arrayList
        System.out.println("\n4.Retrieve Item:");
        String result = color.get(color.size()-1);
        System.out.println(result);


        //5.update element
        System.out.println("\n5.update item");
        color.set(1, "White");
        printArray(color);
        //6. Remove Item from index
        System.out.println("\n6 .Remove item");
        color.remove(0);
        printArray(color);

        //7. Search element in arrayList
        System.out.println("\n7 search element in arrayList");
        boolean result1 = color.contains("Blue");
        System.out.println(result1);

////        Collections.sort(color);
//        System.out.println(color);

        //8. Sort ArrayList
        System.out.println("\n8 sort elements in arrayList");
        color.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(color);

        //9. Copy 1 array to other array
        System.out.println("\n9 Copy Array: ");
//        List<String> copyList = new ArrayList<>();
//        copyList.addAll(color);
        //9.1 copy using constructor
        System.out.println("\n9.1 Copy using constructor");
        List<String> copyColor1 = new ArrayList<>(color);
        System.out.println(copyColor1);
        //9.2 Copy using addAll method
        System.out.println("\n9.2 Copy using addAll method");
        List<String> copyColor2 = new ArrayList<>();
        copyColor2.addAll(color);
        System.out.println(copyColor2);

        //10. shuffle + reverse elements in the list
        System.out.println("\n10 shuffle element");
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);

        Collections.reverse(color);
        System.out.println(color);

        //11.portion
        List<String> subList = color.subList(0,3);
        System.out.println(subList);






    }

    //Add item at first index
    public static void addItemToArrayAtFirst(String item, List<String> arrayList){
        arrayList.add(0, item);
    }

    //print array
    public static void printArray(List<String> arrayList){
        System.out.println(arrayList);
    }


}