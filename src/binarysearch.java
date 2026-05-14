public class binarysearch {
    public static void main(String[] args) {
        int[] nums = {20, 35, 41, 49, 65, 78, 92};
        int target = 78;
        int ans = binary1(nums, target, 0, nums.length - 1);
        System.out.println(ans);

    }

    static int binary1(int[] arr, int traget, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == traget) {
            return m;
        }
        if (traget < arr[m]) {
            return binary1(arr, traget, s, m - 1);

        }
        return binary1(arr, traget, m + 1, e);

    }

    static int binary(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            }
            if (target == arr[mid]) {
                return mid;
            }

        }

        return -1;

    }
}