package Recursion;

public class check_power_of_N {
    static boolean checkpower(int num , int n){
        if(num==1){
            return true;
        }
        else{
            if(num%n==0){
                num/=n;
                return checkpower(num, n);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int num= 216;
        int n= 6;
        System.out.println(checkpower(num, n));
    }
    
}
