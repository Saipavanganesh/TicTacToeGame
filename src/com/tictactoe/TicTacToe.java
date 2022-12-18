package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    Scanner sc=new Scanner(System.in);
    char[] board= new char[10];
    char userInput,comInput;
    public void welcome(){
        System.out.println("Tic Tac Toe Game");
        System.out.println("****************");
        System.out.println(" ");
    }
    public void uc1_gameStarts(){
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
    public void uc2_selectOption(){
        System.out.println(" ");
        System.out.println("Enter X or O to choose as your option");
        char option=sc.next().charAt(0);
        switch(option){
            case 'X':
            case 'x':
                userInput='X';
                comInput='O';
                System.out.println("Your option is 'X' Computer option is 'O'");
                break;
            case 'o':
            case 'O':
                userInput='O';
                comInput='X';
                System.out.println("Your option is 'O' Computer option is 'X'");
                break;
            default:
                System.out.println("Choose either X or O");
                break;
        }
    }
    public void uc3_showBoard(){
        System.out.println(" ");
        System.out.println("Current Board");
        System.out.println(board[1]+" | "+ board[2]+" | "+ board[3]);
        System.out.println("- + - + -");
        System.out.println(board[4]+" | "+ board[5]+" | "+ board[6]);
        System.out.println("- + - + -");
        System.out.println(board[7]+" | "+ board[8]+" | "+ board[9]);
    }
    public void uc4_makeMove(){
        System.out.println(" ");
        System.out.println("Select a location to make a move");
        int move=sc.nextInt();
        if(board[move]==' '){
            board[move]=userInput;
            uc3_showBoard();
        }
        else{
            System.out.println("This location is not available");
        }
    }
    public void uc5_checkFreeSpaces(){
        System.out.println("Available positions are:");
        for(int i=1;i<10;i++){
            if(board[i]==' '){
                System.out.println(i+" ");
            }
        }
    }
}
