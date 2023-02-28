public class FindPeakIndexInMountainArray{
   public static void main(String[] args){
      int[] arr={0,1,0};
      int ans = search(arr);
      System.out.println(arr[ans]);
      
   }
   static int search(int[]arr){
      int start=0;
      int end=arr.length-1;
      while(start<end){
         int mid=(start+end)/2;
         //we are in decreasing part of the array
         //this may be the ans but look left
         //that's why end!=mid-1
         if (arr[mid]>arr[mid+1]){//this means we are in decreasing part of array
               end=mid;
         }else{//this means we are in descending part
               start=mid+1;
         }
      }
      return start;
   }
      
}
