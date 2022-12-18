package com.tictactoe;

public class TicTacToe {
    public void welcome(){
        System.out.println("Tic Tac Toe Game");
        System.out.println("****************");
        System.out.println(" ");
    }
    public void uc1_showBoard(){
        char[] board= new char[10];
        for(int i=0;i<10;i++){
            board[i]=' ';
        }
        System.out.println("Empty Board");
        System.out.println(board[1]+" | "+ board[2]+" | "+ board[3]);
        System.out.println("- + - + -");
        System.out.println(board[4]+" | "+ board[5]+" | "+ board[6]);
        System.out.println("- + - + -");
        System.out.println(board[7]+" | "+ board[9]+" | "+ board[9]);
    }
}
