//to find element in infinite length sorted array 

import java.util.*;
import java.io.*;

public class InfiniteArray{
   public static void main(String[] args){
      int [] arr ={1,2,3,4,6,7,
                  8,10,16,19,20,23,24,29};// keep size of array big to avoid the array index bound condition when we double the size itt may exceed
      int target=10;
      System.out.println(ans(arr,target));
   
   }
  static int ans(int[] arr,int target){
      //first find the range
      //first start with a box size of 2
      int start=0;
      int end=1;
      while(target > arr[end]){
         int temp = end + 1; // this is my new start
         //double the size of the array
         end = end + (end - start + 1) * 2;
         start=temp;
      }
      return binarysearch(arr,target,start,end);
   }
   
   // Find position of an element in a sorted array of infinite numbers
  static int binarysearch(int[] arr,int target,int start, int end){
      //System.out.println(end);
      while(start<=end){
         int mid=start+(end-start)/2;
         if(target<arr[mid]){
             end=mid-1;
          }else if(target>arr[mid]){
             start=mid+1;
          }else{
          //ans found
             return mid;
        }
      }
    return -1;
   }
}

