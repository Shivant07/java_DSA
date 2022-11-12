package Recursion;
/* *
 * **
 * ***
 * ****
 * *****
 */
public class pattern1 {
    static int ptrn1(int n,int i){
        if (n==0){
            return 0;
        }
        else{
            System.out.print("*");
            System.out.println(" "); 
            return ptrn1(n-1,i++);

        }
    }
    public static void main(String[] args) {
        int n=5;
        ptrn1(n,1);
    }

    
}
