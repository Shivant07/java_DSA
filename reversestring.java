package Recursion;

public class reversestring {
    static String reverse(String str){
        //termination case
        if(str.length()==1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str="Hello World";
        String revstr= reverse(str);
        System.out.println(revstr);
    }
}
