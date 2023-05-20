package org.exercise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Map<String, String> map = creatMap();
//
//        System.out.println("1.Iterate by Iterator: ");
//        Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
//        while(itr.hasNext()){
//            Map.Entry<String, String> entry = itr.next();
//            System.out.println(entry.getKey() + "|" + entry.getValue());
//        }
//
//        System.out.println("2.ForEach method");
//        for(Map.Entry<String, String> m : map.entrySet()){
//            System.out.println(m.getKey() + ":" + m.getValue());
//        }
//
//        for(String key : map.keySet()){
//            System.out.println(key);
//        }
//
//        for(String value : map.values()){
//            System.out.println(value);
//        }
//
//        for(Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
//
//        System.out.println(map.keySet().size());
//        System.out.println(map.values().size());
//        int size = map.size();
//        System.out.println(size);
//
//
//        HashMap<String, String> map2 = new HashMap<>(map);
//        System.out.println(map);
//        System.out.println(map2);
//
//        //clear Map
////        map2.clear();
////        System.out.println(map2);
//
//        boolean darith = map2.containsKey("KaKa");
//        System.out.println(darith);

        HashMap<String, Integer> logIn = new HashMap<>();
        logIn.put("darith", 999);
        logIn.put("chanthou", 1989);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you UserName: ");
        String username = sc.nextLine();
        System.out.println("Enter your PIN: ");
        int pin = (Integer) sc.nextInt();


        System.out.println(username + ":" + pin+1);

//        for(Map.Entry user : logIn.entrySet()){
//            if(username == user.getKey() && (Integer)pin == user.getValue()){
//                System.out.println("Log in successful.");
//            } else {
//                System.out.println("Incorrect username or password.");
//            }
//        }
    }

    public static Map<String , String> creatMap(){
        return Map.of(
               "Darith", "Software Developer",
                "Chanthou", "Accounting Manager",
                "Dara", "Marketing Manager",
                "Sopha", "CEO"
        );
    }

}
