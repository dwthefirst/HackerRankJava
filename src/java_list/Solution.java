package java_list;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        //The first line contains an integer,  (the initial number of elements in ).
        int initalNumberOfElements = scan.nextInt();
        scan.nextLine();
        //System.out.println("Initial Number of Elements: "+ initalNumberOfElements);

        //The second line contains  space-separated integers describing .

        String valuesInput = scan.nextLine();
        //System.out.println("Values: "+ valuesInput);
        //put into an ArrayList
        ArrayList<String> listValues = new ArrayList<>(Arrays.asList(valuesInput.split(" ")));
        ArrayList<Integer> listValuesInt = new ArrayList<>();
        for(String element : listValues) {
            listValuesInt.add(Integer.parseInt(element));
        }
        //System.out.println("List of values (Int): " + listValuesInt);

        int numOfQueries = scan.nextInt();
        scan.nextLine();
        //System.out.println("Num of queries: "+ numOfQueries);

        //loop the amount of times of the number of queries
        for(int i = 0; i < numOfQueries; i++) {
            //System.out.println("\tLoop number: " + (i + 1));
            String queryType = scan.nextLine();
            //System.out.println("Query type: " + queryType);

            //INSERT - x, y -> x is the index, y is the value
            if(queryType.equals("Insert")) {
                String insertLine = scan.nextLine();
                //System.out.println("Insert Query: " + insertLine);
                ArrayList<String> insertList = new ArrayList<>(Arrays.asList(insertLine.split(" ")));
                int index = Integer.parseInt(insertList.get(0));
                //System.out.println("Adding Index: " + index);
                int valueToAdd = Integer.parseInt(insertList.get(1));
                //System.out.println("Adding Value: " + valueToAdd);

                listValuesInt.add(index, valueToAdd);
                //System.out.println("List: " + listValuesInt);
            }
            //DELETE - x -> the index to be deleted
            else if (queryType.equals("Delete")) {
                String deleteIndexString = scan.nextLine();
                //System.out.println("Delete Query: " + deleteIndexString);

                int indexToRemove = Integer.parseInt(deleteIndexString);
                listValuesInt.remove(indexToRemove);
                //System.out.println("List: " + listValuesInt);
            }
        }

        for(int element : listValuesInt) {
            System.out.print(element + " ");
        }

    }
}
