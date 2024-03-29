package java2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        //code
        int columns = arr.get(0).size();
        int rows = arr.size();
        int largestSum = Integer.MIN_VALUE;
        int sum = 0;

        //loop through the 6 x 6 array

        //in the outer loop, loop through all the elements in the ROW stopping at the 4th element/COLUMN (third index)
        for(int i = 0; i <= rows - 3; i++ ) {


            //outer loop - loop through the first 3 elements (top)
            System.out.println("Row [" + i + "] ");

            //for each hourglass in row [i] (moving it across right on the top row)
            //System.out.println("");
            for(int m = 0; m <= columns - 3; m++) {
                sum = 0; //resetting sum to 0 for each hourglass loop

                //System.out.print("Moving over: m = " + m);
                //System.out.println("   Starting number: " + arr.get(i).get(m));
                //System.out.println("    Top Row: First 3 elements: ");

                // int firstElement = arr.get(i).get(m);
                // int secondElement = arr.get(i).get(m + 1);
                // int thirdElement = arr.get(i).get(m + 2);
                // System.out.print(firstElement + " " + secondElement + " " + thirdElement);

                for(int k = 0; k < 3; k++) {
                    System.out.print(arr.get(i).get(m + k) + " ");
                    sum+= arr.get(i).get(m + k);//adding sum total to each number
                    //System.out.println("Sum = " + sum);
                }

                System.out.println();

                //System.out.println("     Second Row: Middle element: ");
                for(int j = 0; j < 1; j++) { //elements in column
                    System.out.print("  " + arr.get(i + 1).get(m + 1) + " "); //need to get the element from the next row down from i
                    //sum += arr.get(i + 1).get(j + 1);  //add the 2nd element in the middle row to sum
                    sum+= arr.get(i + 1).get(m +1);//adding to sum total
                    //System.out.println("Sum = " + sum);
                }

                //System.out.print("     Third Row: First 3 elements: ");
                System.out.println();
                for(int l = 0; l < 3; l++) { //elements in column
                    System.out.print(arr.get(i + 2).get(m + l) + " "); //need to get the element from the next row down from i
                    sum += arr.get(i + 2).get(m + l);  //add each of the first 3 elements in the third row to sum
                    //System.out.println("Sum = " + sum);

                }

                System.out.println();

                System.out.println("Sum = " + sum);
                if(sum > largestSum) {
                    largestSum = sum;
                }

                //System.out.println();



                // for(int k = 0; k < 3; k++) { //columns
                //     //System.out.println("    Starting number: " + arr.get(i).get(k));
                //     //System.out.println("k = " + k);
                //     //System.out.println();
                //     System.out.print(arr.get(i).get(k) + " ");
                //     //sum += arr.get(i).get(k);  //add each of the first 3 elements in the top row to sum

                // }
                // System.out.println();

                // //System.out.print("     Second Row: Middle element: ");
                // for(int j = 0; j < 1; j++) { //elements in column
                //     System.out.print("  " + arr.get(i + 1).get(j + 1) + " "); //need to get the element from the next row down from i
                //     sum += arr.get(i + 1).get(j + 1);  //add the 2nd element in the middle row to sum

                // }
                // System.out.println();

                // //System.out.print("     Third Row: First 3 elements: ");
                // for(int l = 0; l < 3; l++) { //elements in column
                //     System.out.print(arr.get(i + 2).get(l) + " "); //need to get the element from the next row down from i
                //     sum += arr.get(i + 2).get(l);  //add each of the first 3 elements in the third row to sum

                // }


            }
        }

        System.out.println(largestSum);




        //last row - stop at the 4th row


        //next loop - loop through the next row - the first 3 elements
        //last loop - loop through the last row - the first 3 elements
        //get all the numbers that aren't 0, and add it to a sum.
        //for each hourglass loop total - compare it the largestSum. If it's bigger, then store the new value
        //after going through all the hour glasses,the largestSum shourt return the largest sum

        // for(List <Integer> row : arr) {
        //     for(int elm : row) {
        //         System.out.print(elm + " ");
        //     }
        //     System.out.println();
        // }

        // bufferedReader.close();

    }
}
