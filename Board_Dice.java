package Recursion;

import java.util.ArrayList;

public class Board_Dice {
    
    static ArrayList<String> dicepos(int source , int target){
        if(source == target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(source>target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalresult = new ArrayList<>();
        for(int dice =1 ; dice<= 6 ; dice++){
            int currentvalue = dice + source;
            ArrayList<String> list =dicepos(currentvalue, target);
            for(String temp : list){
                finalresult.add(temp + dice);

            }
        }
        return finalresult;
    }
    public static void main(String[] args) {
        System.out.println(dicepos(0,10));
        
    }
    
}
