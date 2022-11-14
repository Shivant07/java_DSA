package Recursion;

public class countzero {
    
    static int count_zero(int n, int count){
        if(n>=1 && n<=9){
            return count;
        }
        else{
            if(n%10 == 0){
                count++;
                }
            return count_zero(n/10,count);
        }
    }
    public static void main(String[] args) {
        int n=1000;
        int count = 0;
        System.out.println("Zero in the given number are : " + count_zero(n, count));
    }
    
}
