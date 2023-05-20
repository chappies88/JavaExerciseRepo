package org.example;

import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(6);
        arrayList.add("kandal");
        arrayList.add("phnom penh");
        arrayList.add("Siemreap");
        arrayList.add("Pailen");

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.trimToSize();

        ArrayList<String> arrayList1 = new ArrayList<>(3);
        arrayList1.add("Cyber");
        arrayList1.add("Investigate");
        arrayList1.add("Administration");
        System.out.println(arrayList1);
        arrayList1.add("External Observe");
        System.out.println(arrayList1);
        arrayList1.add("SalaCyber");
        System.out.println(arrayList1);
        arrayList1.ensureCapacity(20);
        System.out.println(arrayList1.size());
        arrayList1.add(5, "Kaka");
        System.out.println(arrayList1);
        arrayList1.set(5, "Back Office");
        System.out.println(arrayList1);


        for(int i=0;i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }

        for(String item : arrayList1){
            System.out.println(item);
        }




    }



}
