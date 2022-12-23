package gitgithubprojects;

import java.util.Arrays;

public class MDArrayConvertToArray {
    public static void main(String[] args) {
        //Ex: Convert a multidimensional array to a regular array.
        int[][] myArray = {{2, 5, 1}, {32, 75}};
        int sum = 0;

        for (int[] w : myArray) {
            sum += w.length;
        }
        System.out.println(sum);//Number of elements in multidimensional array

        //We create a new array,
        int[] arr = new int[sum];//equals to the number of elements of the multidimensional array
        int idx = 0;//new array's index

        for (int[] w : myArray) {
            for (int k : w) {
                arr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
