package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1.	Create an instance of an ArrayList of String called employeeNames
        List<String> employeeNames = new ArrayList<>();
        //2.	Create an instance of a HashSet of Integer called ids
        Set<Integer> ids = new HashSet<>();
        //3.	Create an instance of a HashMap of Integer, String called employeeMap
        Map<Integer, String> employeeMap = new HashMap<>();

        //4.	Add at least five entries to the employeeNames and ids
        // (make sure both collections have the same number of entries).
        employeeNames.add("Tom Cruise");
        employeeNames.add("Denzel Washington");
        employeeNames.add("Tiger Woods");
        employeeNames.add("Seth Rogen");
        employeeNames.add("Pete Davidson");

        ids.add(0);
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);




    }
}
