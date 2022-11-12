package Recursion;


public class print_armstrong {
    static int armstrng(int num,int count){
        if(num<=0){
            return 0;
        }
        int digit=num%10;
        return (int)Math.pow(digit,count) + armstrng(num/10, count);
    }
    static int printarmstrong(int n ,int c){
        if(n==0){
            return 0;
        }
        armstrng(n, c);
        return printarmstrong(n-1, c);
    }
    public static void main(String[] args) {
        int n=1000;
        int count=4;
        System.out.println(printarmstrong(n, count));
        }

    }
    


    
