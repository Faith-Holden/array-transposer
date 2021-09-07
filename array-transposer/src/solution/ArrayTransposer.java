package solution;

import java.util.Arrays;

public class ArrayTransposer {
    public static void main(String[] Args){

        int[] array1 = new int [] {1,2,3,4};
        int[] array2 = new int [] {5,6,7,8};
        int[] array3 = new int [] {9,10,11,12};
        int[][] originalArray = new int [][]{array1,array2,array3};
        int[][] transposedArray= transposeArray(originalArray);

        print2dArray(originalArray);
        System.out.println("__________________");
        print2dArray(transposedArray);
    }

    public static int[][] transposeArray(int[][] originalArray){
        int newWidth = originalArray.length;
        int newHeight = originalArray[0].length;

        int[][] newArray = new int[newHeight][newWidth];

        for(int i = 0; i<newWidth; i++){
            for(int j = 0; j<newHeight; j++){
                newArray[j][i] = originalArray[i][j];
            }
        }

        return newArray;
    }

    public static void print2dArray (int[][] array2d){

        for(int[] array: array2d){
            for (int item:array){
                System.out.print(item + ",");
            }
            System.out.println();
        }
    }




}
