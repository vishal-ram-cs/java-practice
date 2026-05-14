import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class alldivisors {
    public static void main(String[] args) {
        int n=12;
       List<Integer> res=  check(n);
       System.out.println(res);

    }
    static List<Integer> check(int n){
        ArrayList<Integer> divisor= new ArrayList<>();
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                divisor.add(i);
            }
            if(n/i!=i){
                divisor.add(n/i);
            }

        }  Collections.sort(divisor);
        return divisor;
    }
}
