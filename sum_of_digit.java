package Recursion;

public class sum_of_digit {
    static int sum(int n){
        if (n==0){
              return 0;
        }
        else{
            return(n%10 + sum(n/10));
        }
    }
    public static void main(String[] args) {
        int n = 23145;
        System.out.println("sum of digits is :" + sum(n));
    }
    
}
