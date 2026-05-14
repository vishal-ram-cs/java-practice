import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr={5,2,6,4,8,1};
        int[] ans = merges(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] merges(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merges(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merges(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] sec) {
        int[] arr1 = new int[first.length + sec.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < sec.length) {
            if (first[i] < sec[j]) {
                arr1[k] = first[i];
                i++;


            } else {
                arr1[k] = sec[j];
                j++;

            }
            k++;

        }
        while(i<first.length){
            arr1[k]=first[i];
            i++;
            k++;

        }
        while(j<sec.length){
            arr1[k]=sec[j];
            j++;
            k++;
        }
        return arr1;
    }
}