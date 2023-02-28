import java.util.*;
import java.io.*;
import java.util.Arrays;

public class FirstAndLastIndex{
   public static void main(String[] args){
      int[] solve= new int[2];
   //to find first and last index of target in given sorted array
      int[] arr={1,2,4,5,7,7,8,9};
      int target=7;
      // solve= search(arr,target);
      System.out.println(Arrays.toString(search(arr,target)));
      }
   static int[] search(int[] arr,int target){
      int[] ans={-1,-1};
      ans[0]=binarysearch(arr,target,true);
      if(ans[0]!=-1){
         ans[1]=binarysearch(arr,target,false);
      }
      return ans;
      }
      // the below function will return only the index of target
  static int binarysearch(int[] arr,int target,boolean isstart){
      int ans=-1;
      int start =0;
      int end=arr.length-1;
      while(start<=end){
       int mid=(start+end)/2;
       if (target<arr[mid]){
          end=mid-1;
       }else if(target>arr[mid]){
          start=mid+1;
       }else{
          ans=mid;
          if(isstart){
            end=mid-1;
          }else{
            start=mid+1;
          }
       }
       
      }
    return ans;
   }
}