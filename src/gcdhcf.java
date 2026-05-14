public class gcdhcf {
    public static void main(String [] args){
   check(6,12);
    }
    static void check(int n1,int n2){
        int mi=Math.min(n1,n2);
        int gcd=1;

            while(n1>0&&n2>0){
                if(n1>n2){
                    n1=n1%n2;
                }else{
                    n2=n2%n1;
                }
                if(n1==0){
                    System.out.println(n2);
                }else{
                    System.out.println(n1);
                }
            }
        }
    }

