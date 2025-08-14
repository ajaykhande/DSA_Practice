public class ArrayManipulation {
    public static int findSecondLargest(int[] nums) {
     
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than largest
            if (nums[i] > largest) {
                secondLargest = largest; 
                largest = nums[i];      
            }
            // If current number is between largest and second largest
            else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i]; 
            }
        }

        return secondLargest; 
    }
 
    public static void main(String[] args) {
      int [] nums = {44,5,1,45,1,4,5,};
     
        System.out.println(findSecondLargest(nums));
        
    }
}
