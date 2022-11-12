package Recursion;

public class power {
    static int pow(int n ,int p){
        if(p==0){
            return 1;
        }
        else {
            return n * pow(n,p-1);
        }

        }
        public static void main(String[] args) {
            int n=3;
            int p=3;
            System.out.println("power of three is:" + pow(n,p));
        }
    }
    

