import java.util.Arrays;
public class NFassignment {
    public static void main(String[] args) {

        int[] arr={1,0,2,0,3,4};
        sumofarray(arr);
        zeroatend(arr);
        int[] nums={12,45,89,65,53};
        secondlargest(nums);
    }
    static void sumofarray(int [] arr){   //QUESTION 1
        int sum =arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the array is "+ sum);
    }
    static void zeroatend(int [] arr){   //QUESTION 2
        int index=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0) arr[index++]=arr[i];
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println("Array of zero at end "+Arrays.toString(arr));
    }
    static void secondlargest(int [] arr){ //QUESTION 3
        int largest = arr[0];
        int second= -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println("Second largest number of array"+ second);

    }
}
