package ort.exercise.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> emp = new LinkedList<>();
        emp.add("Chanthou");
        emp.add("Tommy");
        emp.add("Jerry");
        System.out.println(emp);

        emp.addLast("Sasa");
        System.out.println(emp);

        emp.addFirst("Barang");
        System.out.println(emp);

        emp.add("Gamnang");
        System.out.println(emp);


        System.out.println("Iterate LinkList: ");
        for(String item : emp){
            System.out.println(item);
        }

        System.out.println("\nUsing Iterator");
        Iterator it = emp.descendingIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        Iterator it2 = emp.iterator();
        System.out.println(it2.next());
        System.out.println(it2.next());






    }




}
