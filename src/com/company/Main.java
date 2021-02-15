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

//5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop.
//     Inside the enhanced for loop use employeeMap.put() to add a new entry to the map.
//    The entry should consist of a key that is the id in the enhanced loop’s current iteration,
//   and a value that is the employeeName at position i of the employeeNames ArrayList.
//  Increment i so that each iteration grabs the next element in the ArrayList.

        int i = 0;
        for (Integer key : ids) {
            i = key;
            employeeMap.put(key, employeeNames.get(key));
        }
        System.out.println(employeeMap);


        //6.	Once the employeeMap is fully populated, use another enhanced for loop
        // to iterate over the employeeMap.keySet(), and use the key for each current iteration
        // to print to the console both the current key and its associated value in the map.

        for (Integer key : employeeMap.keySet()) {
            System.out.println(key + "=" + employeeMap.get(key));
        }


        //7.	Create a StringBuilder called idsBuilder.

        //8.	Iterate over the ids HashSet and append each id,
        //      followed by a dash “-“ to idsBuilder.


        //9.	Print the result of idsBuilder.toString() to the console.


        //10.	Create another StringBuilder called namesBuilder.


        //11.	Iterate over the employeeNames ArrayList and append each name,
        //       followed by a space “ “ to the namesBuilder.


        //12.	Print the result of namesBuilder.toString() to the console.


    }
}
