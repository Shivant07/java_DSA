package Recursion;

public class check_power {
    static boolean checkpower(int n){
        if(n==1){
            return true;
        }
        else{
            if(n%2==0){
                n/=2;
                return checkpower(n);
            }
            return false;

        }
            }
    public static void main(String[] args) {
        int n=199;
        System.out.println(checkpower(n));
    }
    
}
