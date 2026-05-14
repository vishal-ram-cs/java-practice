import java.util.Arrays;

public class sort{
    public static void main(String[] args) {
        int [] arr ={2,1,6,5,3,4};
       cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycle(int [] arr){
      int i=0;
      while(i<arr.length){
          int crtindex=arr[i]-1;
          if (arr[i]!=arr[crtindex]){
              swap(arr , i,crtindex);

          }
          else{
              i++;
          }

      }
    }
    static void insertion(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);

                    }else{
                    break;
                }
            }
        }

        }
    static void swap(int[] arr, int  first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selection(int [] arr){
        for(int i=0;i< arr.length;i++){
            int last = arr.length-i-1;
            int max =0;
            for (int j=0; j<=last ;j++){

                if(arr[j]>arr[max]){
                    max=j;

                }
          }    int temp = arr[ last];
            arr[last]=arr[max];
            arr[max]=temp;

        }
    }
}
