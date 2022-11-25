package Recursion;

public class N_Queen {
   
    static int n=4;
    static boolean board[][] = new boolean[n][n];
    static boolean caWeplaceQueen(int row , int col){
        // check for up
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }

        //check for left diadonal
        for(int i =row , j=col;i>=0 && j>=0 ; i--, j--){
            if(board[i][j])
            return false;
        }

        // check for right diagonal
        for(int i =row , j=col;i>=0 && j<board.length ; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    static int countnumberofways(int row){
        int Count=0;
        if(row==board.length){
            return 1;
        }
        for(int col = 0; col<board.length; col++){
            if(caWeplaceQueen(row, col)){
            board[row][col] = true;
            Count = Count + countnumberofways(row+1);
            board[row][col]=false;
            }   
        }
        return Count;
    }
    public static void main(String[] args) {
        int Count =countnumberofways(0);
        
        System.out.println(Count);
        
    }
    
}
