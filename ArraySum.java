// return sum of array

public class ArraySum{
   public static int main(String[] args){
      int[] nums = {1,2,3,4};
      for(int i=1;i<nums.length;i++){
         nums[i]=nums[i-1]+nums[i];
         // case1:(i=0) nums[0]=nums[1-1]+nums[1] 
         //nums[0]=1
         //case 2:(i=1) nums[2]=nums[2-1]+nums[2]
         //nums[2]=3
       for(int i=1;i<nums.length;i++){
         System.out.println(nums[i]);
      }
    }
    return nums;
  }
} 