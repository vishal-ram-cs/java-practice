import java.util.Scanner;

public class panlin {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the word");
        String a = obj.nextLine();
        System.out.println(check(a));

    }
    static boolean check(String str){
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start =str.charAt(i);
            char last = str.charAt(str.length()-1-i);
            if (start==last){
                return true;
            }
        }
        return false;
    }
}
