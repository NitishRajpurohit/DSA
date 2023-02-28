import java.util.*;
import java.io.*;

public class FindElementInMountainArray{
   public static void main(String[]args){
      int[] solve={-1,-1};
      int[] arr={1,2,3,4,5,3,1};
      int n=arr.length-1;
      int target=3;
      int ans=peak(arr);
      System.out.println(ans);//idex of highest element in array
      solve[0]=orderbinary(arr,0,ans,target);
      // if(solve[0]!=-1){
      solve[1]=orderbinary(arr,ans,n,target);
     //  }
      System.out.println(Arrays.toString(solve));
   
   }
   //find peak index in mountain Array
   static int peak(int[] arr){
         int start=0;
         int end=arr.length-1;
         while(start<end){
            int mid=start+(end-start)/2;
            //we are in decreasing part of the array
            //this may be the ans but look left
            //that's why end!=mid-1
            if(arr[mid]>arr[mid+1]){
               end=mid;
            }else{
               start=mid+1;
            }
         }
         //in the end start==end both are pointing to the largest number in array because of 2 checks above
         //start and end are both pointing to the same max element in the arrays because this is what the check says
         //return start or end both are same beacuse both hold the most possible answers
         return start;
   }
    static int orderbinary(int[] arr,int start, int end, int target){
         boolean isasc = arr[start]>arr[end];
         int mid=(start+end)/2;
         while(start<=end){
         if(target==arr[mid]){
            return mid;
         }
         if(isasc){
            if(target<arr[mid]){
               end=mid-1;
            }else{
               start=mid+1;
            }
         }else{
            if(target<arr[mid]){
               start=mid+1;
            }else{
               end=mid-1;
            }
         }
         
    }
    return -1;
}
}





// public class SearchInMountain {
//     public static void main(String[] args) {
// 
//     }
//     // https://leetcode.com/problems/find-in-mountain-array/
//     int search(int[] arr, int target) {
//         int peak = peakIndexInMountainArray(arr);
//         int firstTry = orderAgnosticBS(arr, target, 0, peak);
//         if (firstTry != -1) {
//             return firstTry;
//         }
//         // try to search in second half
//         return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
//     }
// 
//     public int peakIndexInMountainArray(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
// 
//         while (start < end) {
//             int mid = start + (end - start) / 2;
//             if (arr[mid] > arr[mid+1]) {
//                 // you are in dec part of array
//                 // this may be the ans, but look at left
//                 // this is why end != mid - 1
//                 end = mid;
//             } else {
//                 // you are in asc part of array
//                 start = mid + 1; // because we know that mid+1 element > mid element
//             }
//         }
//         // in the end, start == end and pointing to the largest number because of the 2 checks above
//         // start and end are always trying to find max element in the above 2 checks
//         // hence, when they are pointing to just one element, that is the max one because that is what the checks say
//         // more elaboration: at every point of time for start and end, they have the best possible answer till that time
//         // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
//         return start; // or return end as both are =
//     }
// 
//     static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//         // find whether the array is sorted in ascending or descending
//         boolean isAsc = arr[start] < arr[end];
// 
//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;
// 
//             if (arr[mid] == target) {
//                 return mid;
//             }
// 
//             if (isAsc) {
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if (target > arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }