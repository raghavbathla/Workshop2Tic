package ticTacToe;

public class TicTacToeClass {
    static private char  board[] = new char[10];

    static private void assign(){
        for(int i=1; i <=board.length-1; i++){
            board[i] = ' ';
        }
    }

    public static void main(String[] args)
    {
        assign();
    }
}
