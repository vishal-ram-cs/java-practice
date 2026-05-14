
import java.util.Scanner;
public class countnum {
    public static void main(String[] args) {
        int count=0;
        int rem =0;

        Scanner obj = new Scanner(System.in);
        System.out.print("enter the number :");
        int num=obj.nextInt();
        System.out.println("enter the number to count:");
        int n = obj.nextInt();
        while(num>0){
            rem=num%10;
            if(rem==n){
                count++;
            }
            num=num/10;


        }
        System.out.println(count);

    }
}
