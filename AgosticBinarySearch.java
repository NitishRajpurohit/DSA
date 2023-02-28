
//binary search in both ascending and descending array
public class AgosticBinarySearch{
   public static void main(String[]args){
   int target=18;
   int[] arr={0,5,9,10,18,20};
   int ans=agosticBS(arr,target);
   System.out.println(ans);
      
   }
   static int agosticBS(int[] arr,int target){
      int start=0;
      int end=arr.length-1;
      //find whether the array is in ascending order or descending order
      boolean isAsc = arr[start]<arr[end];// it will return true or false
      while(start<=end){
      //find the middle element
         int mid=(start+end)/2;
          if(arr[mid]==target){
              return mid;
             }
          if (isAsc){
            if(target>arr[mid]){
               start=mid+1;
            }else{
               end=mid-1;
            }
         }else{
          if(target>arr[mid]){
            end=mid-1;
         }else{
            start=mid+1;
         }
       
       }
      }
   return -1;
   }
}