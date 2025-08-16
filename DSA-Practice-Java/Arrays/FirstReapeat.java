
public class FirstReapeat {
     public static int firstRepeatingNumber(int[] nums) {
    
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
              for (int j = i+1; j < nums.length; j++) {
                // if first eliment repeat in the array
                 if (nums[i] == nums[j]) {
                   return  nums[i]; // return 
            }
              }
        }
        return -1; 
    }
 
    public static void main(String[] args) {
      int [] nums = {1,5,3,4,6,3,4};
     
        System.out.println(firstRepeatingNumber(nums));
        
    }
}
