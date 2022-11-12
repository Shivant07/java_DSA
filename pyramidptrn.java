package Recursion;

public class pyramidptrn {
    static int space(int m){
        if(m==0){
            return 0;
        }
        System.out.print(" ");
        return space(m-1);
        }
    static int printstar(int n)
    {
        if(n==0){
        return 0;
        }
        System.out.print("* ");
        return(n-1);
    }
    static int row(int m , int n ){
        if(m==0){
            return 0;
        }
        space(m);
        printstar(n);
        System.out.println();
        return row(m-1, n+1);

    }
    public static void main(String[] args) {
        row(5, 5);
    }
    
    }


