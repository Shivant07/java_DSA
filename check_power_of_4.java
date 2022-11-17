package Recursion;

public class check_power_of_4 {
    static boolean chekpower(int num){
        if(num==1){
            return true;
        }
        else{
            if(num%4==0){
                num/=4;
                return chekpower(num);
            }
            return false;
        }
    
    }
    public static void main(String[] args) {
        int n=64;
        System.out.println(chekpower(n));
    }
    
}
