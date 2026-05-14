public class findthenumbercountisoddoreven {
    public static void main(String[] args) {
        int[] arr = {23, 4, 5, 78, 965, 5255};
        int ans = findnumber(arr);
        System.out.println(ans);
    }
    static int findnumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

 static boolean even(int num) {
     int iseven = String.valueOf(num).length();

     return iseven%2==0;

    }

   /* static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;

        }
        return count;

    }*/
}



