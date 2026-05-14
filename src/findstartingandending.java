public class findstartingandending {
    public static void main(String[] args) {
     int[] arr = {12,23,45,56,67,78,78,78,78,78,89};
     int traget=78;
     System.out.println(binary(arr,traget));

    }
    static int binary(int[] arr, int target){
        int s=0;
        int e=arr.length;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return -1;
    }

}
