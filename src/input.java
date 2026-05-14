import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.print("enter your rollno");
        int a = obj1.nextInt();
       /*for(int i=0;i<=a;i++){
            System.out.print(i); */
        int i = 0;
        while(i<a){
            System.out.println(i);
            i++;

        }

    }
}
