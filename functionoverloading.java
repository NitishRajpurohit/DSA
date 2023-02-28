// function or method overloading means same name different parameters and different tasks

public class functionoverloading{
   public static void main(String[] args){
      fun("nitish");
      fun(30);
   
   }
   static void fun(String name){
      String greeting="Hello  " + name;
      System.out.println(" "  +greeting);
   }
   static void fun(int a){
      System.out.println("the numbers is :  "+a);
   }
}