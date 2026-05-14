public class linearsearch {
    public static void main(String[] args) {
        int[] num = {2,22,34,56,89,90};
        int target=34;
        int ans=linear(num , target);
        System.out.println(ans);
    }
    static int linear(int[] arr , int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }

        }
       return -1;
    }
}
