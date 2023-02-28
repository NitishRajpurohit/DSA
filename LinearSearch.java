import java.io.*;
import java.util.*;

public class LinearSearch{
   public static void main(String[] args){
      int target;
      int[] arr={1,5,8,10,44};
      Scanner sc=new Scanner(System.in);
      System.out.println(Arrays.toString(arr));//giving array as string output
      System.out.println("enter the element to be searched");
      target=sc.nextInt();
      int ans=linearsearch(arr,target);
      System.out.println("element  "+target+" found at index  "+ans);
     }
static int linearsearch(int arr[],int target){
   if(arr.length==0){
    return -1;
   }
   //run a for loop
   for(int index=0;index<arr.length;index++){
   //check the element at every index if it is = target
   int element = arr[index];
   if(element==target){
      return index+1;
      }
   }// this line will return -1 if none of the return statement works
    return -1;

}
}
