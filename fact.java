package Recursion;

public class fact {
    public static int fact1(int n){
        if(n>0){
            return fact1(n-1)*n;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
     int n=5;
     int res=fact1(n);
     System.out.println(res);   
    }
}
