package Recursion;

public class check_power_of_3 {
    static boolean checkpower(int num){
        if(num==1){
            return true;
        }
        else{
            if(num%3 == 0){
                num /= 3;
                return checkpower( num);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int n= 1;
        System.out.println(checkpower(n));
    }
    
}
