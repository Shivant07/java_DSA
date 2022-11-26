package Recursion;

import java.util.ArrayList;

public class branch2 {
    static ArrayList<String> subSequence(String str){
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");// create a list with size 1
            return list;
        }
        char singleChar = str.charAt(0); // get the first index
        String subString = str.substring(1);
        // place the string in recursion
        ArrayList<String> list = subSequence(subString);
        ArrayList<String> newlist = new ArrayList<>();
        // fill the arraylist
        for(int i = 0; i<list.size();i++){
            newlist.add(list.get(i)); // not pick
            newlist.add(singleChar + list.get(i)); // pick
        }
        return newlist;

    }
    public static void main(String[] args) {
        System.out.println(subSequence("amit"));
        
    }
    
}
