package Recursion;

public class factorial {
    static int fact(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else{  
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("the factorial of given number :"+ fact(n));
    }
}
