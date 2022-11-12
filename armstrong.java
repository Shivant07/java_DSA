package Recursion;

public class armstrong {
    static int armstrng(int num,int count){
        if(num<=0){
            return 0;
        }
        int digit=num%10;
        return (int)Math.pow(digit,count) + armstrng(num/10, count);
    }
    public static void main(String[] args) {
        int n=1234;
        if(n==armstrng(n,4)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
    
}
