import java.util.Arrays;

public class missingnum {
    public static void main(String[] args) {
        int [] arr ={1,4,2};
        missing(arr);
        System.out.println(missing(arr));

    }

    static void swap(int [] arr , int fir, int sec){
        int temp = arr[fir];
        arr[fir]=arr[sec];
        arr[sec]=temp;

    }
   static int missing(int[] arr){
        int i=0;
        while(i<arr.length){
            int crtindex=arr[i]-1;
            if (arr[i] <=arr.length && arr[i]!=arr[crtindex]) {
                swap(arr,i,crtindex);
            }else{
                i++;
            }
        }for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;

            }
        }return arr.length;
    }
}
