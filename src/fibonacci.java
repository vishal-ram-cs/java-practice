import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        int a = 0;

        int b =1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the n for fibonacci :");
        int n = obj.nextInt();
        for(int i=2;i<=n;i++){
          int temp = b;
          b=a+b;
          a=temp;

        }
        System.out.println(b);

    }
}
