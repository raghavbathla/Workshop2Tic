package ticTacToe;

import java.security.cert.X509Certificate;
import java.util.Scanner;

public class TicTacToeClass {


    static private char[] assign(){
         char  board[] = new char[10];
        for(int i=1; i <=board.length-1; i++){
            board[i] = ' ';
        }
        return board;
    }

    static private char askUser(){
        Scanner scanner  = new Scanner(System.in);
    System.out.println("Choose between X or O");

    System.out.println("Enter 1 for X or 2 for O");
    int val  = scanner.nextInt();
    if(val == 1)
        return 'X';
    else
        return 'Y';

    }


    public static void main(String[] args)
    {
        assign();
        askUser();
    }
}
