package Recursion;

public class Basic {

    public static void fibo(int a) {
        int b = 0;
        int c = 1;
        fiboo(b,c,a-2);



    }
    private static void fiboo(int b, int c, int a){
        if (a == 0)
            return;


        System.out.print(b+" ");
        fiboo(c, b + c, a - 1);



    }

    public static int power(int x,int n){// number of stack size equal to n
        if(x == 0){
            return 0;
        }
        if( n==0){
            return 1;
        }
        return x*power(x,n-1);

    }

    public static int pow(int x, int n){
        if(x == 0){
            return 0;
        }
        if( n==0){
            return 1;
        }
        if(n % 2 == 0)
            return pow(x,n/2)*pow(x,n/2);
        return pow(x,n/2)*pow(x,n/2)*x;


    }

    public static void main(String args[]){
        int a=5;

        System.out.println(a);
        System.out.println(pow(3,4));
        fibo(10);


    }
}
