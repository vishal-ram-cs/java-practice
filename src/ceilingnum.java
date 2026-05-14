public class ceilingnum {
    public static void main(String[] args) {
        int[] nums = {96,56,85,56,45,31};
        int target = 30;
        System.out.println(ceil(nums, target));
    }

    static int ceil(int[] arr, int target) {

        int min = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] >= target) {
                target=arr[i];
                if (target > min) {
                  min=target;
                    return min;
                }
            }


        }
        return -1;
    }
}
