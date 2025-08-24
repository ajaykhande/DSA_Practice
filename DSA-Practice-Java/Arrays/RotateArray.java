public class RotateArray {

          // Method to reverse part of the array from 'st' to 'end'
    public static int[] reverseArray(int[] nums, int i, int j) {
    
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    // Rotate array by k steps
    public static int[] rotate_1(int[] nums, int k) {
        k = k % nums.length; // Handle if k > length
        int n = nums.length;

        // Step 1: Reverse entire array
        reverseArray(nums, 0,n-1);
        
        // Step 2: Reverse first k elements
        reverseArray(nums, 0,k-1);
        
        // Step 3: Reverse remaining elements
        reverseArray(nums, k, n-1);

        return nums;
    }

     public static int [] rotate_2(int [] arr,int k) {
         int n = arr.length;
         k = k % n;
         int j = 0;
         int ans [] = new int[n];

            for(int i = n-k; i<n; i++){ 
               ans[j++] = arr[i];
            }

              for(int i = 0; i<n-k; i++){
               ans[j++] = arr[i];
            }

       return ans;
       }
       public static void main(String[] args) {
         int [] arr = {1,2,3,4,5};
        int k =4;
        int ans [] = rotate_1(arr,k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

    

