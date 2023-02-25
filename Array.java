import java.util.*;
public class Array{
   public static void main(String[] args){
      int[] arr = new int[5];
      Scanner sc = new Scanner(System.in);
      for (int i=0;i<5;i++){
         System.out.println("enter elements");
         arr[i]=sc.nextInt();
         }
         System.out.println("output elments are");
         for (int j=0;j<5;j++){
            System.out.println(arr[j]);
      }
      
   
   
   }
  }