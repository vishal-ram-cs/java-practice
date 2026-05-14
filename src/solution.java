import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public static void main(String[] args) {
      //int [] arr={2,3,3,2};
     // int value = 3;
    //  int [] nums = {5,4,-1,7,8};

    // System.out.println(maxSubArray(nums));
        int []nums = {1,2};
        majorityElement(nums);
    //  System.out.print(  findMaxConsecutiveOnes(arr));

   //   int [] arr={3,4,5,1,2};
     // System.out.println(check(arr));
  //   int [] arr1={1,1,1,2,2,3,3,3};
    // int [] arr2={1,1,2,2,3};
     //union(arr1,arr2);

    }
    public static void sol1(int n, int i){
        if(i>n){
            return;
        }
        sol1(n,i+1);
        System.out.println(i);
    }
    static void sumofNnums(int n , int i , int sum){
        if(n<i){
            System.out.println(sum);
            return;
        }
        sumofNnums(n,i+1 ,sum+i);

    }
    static  int factorial(int n){
        if(n==0) {
            return 0;
        }
        return n + factorial(n-1);

    }
    static void swap(int a, int b){
        int temp= a;
        a=b;
        b=temp;


    }


        public static boolean check(int[] nums) {
            int counter=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>nums[(i+1)%nums.length]){
                    counter++;
                    if(counter > 1 ) return false;
                }
            }
            return true;
        }
    static void union(int [] arr1 , int [] arr2) {
        ArrayList<Integer> arr3=new ArrayList<>();
      for(int i =0;i<=arr1.length;i++){
          if(arr1[i]!=arr1[i+1]){
              arr3.add(arr1[i]);
          }


      }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]!=arr2[j]){
                    arr3.add(arr2[j]);
                }
            }
        }
        System.out.print(arr3);
    }

         static int findMaxConsecutiveOnes(int[] nums) {
            int max=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    count++;

                    max=Math.max(count,max);
                }
                else{
                    count=0;
                }
            }
            return max;
        }

       public  static int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE;
            int sum =0;
            for(int i=0;i<nums.length;i++){
                if(sum>=max){
                    max=sum;
                }
                sum +=nums[i];
                if (sum<0){
                    sum=0;
                }
            }
            return max;

    }

        public static List<Integer> majorityElement(int[] nums) {
            int n=nums.length;
            int count1=0, count2=0;
            int element1=0 , element2=0;
            for(int arr:nums){
                if( arr==element1){
                    count1++;
                }
                else if(arr==element2){
                    count2++;
                }else if(count1==0){
                    element1=arr;
                    count1=1;
                }else if(count2==0){
                    element2=arr;
                    count2=1;
                }else{
                    count1--;count2--;
                }
            }
            count1=count2=0;
            for(int arr:nums){
                if(arr==element1)count1++;
                else if(arr==element2)count2++;
            }
            List<Integer> ans=new ArrayList<>();
            if(count1 > n/3)ans.add(element1);
            if(count2 > n/3) ans.add(element2);
            return ans;
        }



    }






