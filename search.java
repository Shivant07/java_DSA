package Recursion;

import java.util.ArrayList;


public class search {
    static ArrayList<Integer> search1(int arr[],int index,int len ,int element ){
        if(index>=len){
            ArrayList<Integer> Arr = search1(arr, index, len, element);
            return Arr; 
        }
        else{
            ArrayList<Integer> Arr= search1(arr, index+1, len, element);
            if(arr[index]==element){
                Arr.add(index);
            }
            return Arr;   
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,8,2,9,2,7,2};
        int search=2;
        ArrayList<Integer> list = search1(arr, 0, arr.length ,search);
        System.out.println(list);;
    }
    
}
