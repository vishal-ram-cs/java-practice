public class amrstrong {
    public static void main(String[] args) {
        System.out.println(check(153));
    }
    static boolean check(int n){
        int num=n;
        int armnum=0;
        while(n>0){
            int dig=n%10;
           armnum=armnum+(dig*dig*dig);
            n=n/10;

        }
        if(armnum==num){
            return true;
        }
        return false;
    }

}
