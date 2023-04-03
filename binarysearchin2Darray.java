 import java.util.*;
 import java.io.*;
 
 public class binarysearchin2Darray{
   public static void main(String[]args){
      int[][] arr={
                 {1,4,7,9},
                 {10,14,18,20},
                 {23,25,28,30}
      };
      System.out.println(Arrays.toString(binarysearch(arr,30)));
   }
   static int[] binarysearch(int[][] arr,int target){
       int row=0;
       int col=arr[0].length-1;
       while(row<arr.length && col>=0){
         if(target==arr[row][col]){
            return new int[]{row,col};
            }
       if(target>arr[row][col]){
            row++;
       }else{
            col--;
       }
   }
       return new int[]{-1,-1};
   }
 }