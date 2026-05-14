import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol {
  /*  public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit (rightmost)
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If it's 9, it becomes 0 and we continue to carry 1
            digits[i] = 0;
        }

        // If all digits were 9, we now need an extra digit at the start
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    // ✅ Main method to test the function
    public static void main(String[] args) {
        int[] digits = {4, 4, 9};

        // Call the function
        int[] result = plusOne(digits);

        // Print the result
        System.out.println("Output: " + Arrays.toString(result));
    } */

      public static List<Integer> findDisappearedNumbers(int[] nums) {
          int arr[]=new int[nums.length];
          ArrayList<Integer>list=new ArrayList<>();
          for(int i=0;i<nums.length;i++){
              arr[nums[i]-1]=nums[i];
          }
          for(int i=0;i<arr.length;i++){
              if(arr[i]==0){
                  list.add(i+1);
              }
          }
          return list;
      }
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even so we always compare proper pairs
            if (mid % 2 == 1) {
                mid--;
            }

            // If nums[mid] == nums[mid + 1], the single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                // Otherwise, it's on the left (including mid)
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
       // int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        //List<Integer> missing = Sol.findDisappearedNumbers(nums);

        //System.out.println("Missing Numbers: " + missing);


        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int[] nums3 = {1, 1, 2};

        System.out.println(singleNonDuplicate(nums1)); // Output: 2
        System.out.println(singleNonDuplicate(nums2)); // Output: 10
        System.out.println(singleNonDuplicate(nums3));
    }
}
