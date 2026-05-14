public class patten {
    public static void main(String[] args) {
    patten19(5);
    }
    static void patten19(int n){
        int space =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<space;j++){
                System.out.print(" ");

            }
            for(int j =0;j<n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();

        }
    }
    static void patten15(int n){
        for(int i=1;i<=n;i++){
            char ch =(char) ('A'+ i-1);
            for(int j =1;j<=i;j++){

                System.out.print(ch);


            }
            System.out.println();
        }
    }
    static void patten14(int n){
        for(int i=1;i<=n;i++){
            for(char j ='A';j<='A'+(n-i);j++){
                System.out.print(j+" ");


            }
            System.out.println();
        }
    }
    static void patten13(int n){
        int num =1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;

            }
            System.out.println();
        }
    }
    static void patten12(int n){
        for(int i =1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);

            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");

            }


            for(int j=i; j>=1;j--){
                    System.out.print(j);

                }
            System.out.println();

        }
    }
    static void patten11(int n ){
        for(int i =0;i<=n;i++){
            int temp = i%2==0?1:0;
            for(int j =0;j<i;j++){
                temp=1-temp;
                System.out.print(temp);

            }
            System.out.println();
        }
    }
    static void patten5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j );

            }System.out.println();
        }

    }
    static  void patten8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");

            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");

            }
            for(int j=0;j<=i;j++){
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    static void patten2(int n ){
        for(int i=0;i<2*n;i++){
            int tocol=i>n?n*2-i:i;
            int space = n-tocol;
            for (int s =0; s <space ;s++){
                System.out.print(" ");
            }for (int j=0;j<tocol;j++){
                System.out.print("* ");
            }
            System.out.println();
            }


        }

    static void patten1(int n ){
        for(int i=0;i<2*n;i++){
            int tocol=i>n?n*2-i:i;
            for (int j=0;j<tocol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patten28(int n){
        for(int i=0; i <n;i++ ){
            for(int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

