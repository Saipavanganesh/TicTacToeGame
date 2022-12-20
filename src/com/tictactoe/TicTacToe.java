package com.tictactoe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    char[] board = new char[10];
    char userInput, comInput;
    ArrayList<Integer> freeSpaces = new ArrayList<Integer>();

    public void welcome() {
        System.out.println("Tic Tac Toe Game");
        System.out.println("****************");
        System.out.println(" ");
    }

    public void uc1_gameStarts() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
        System.out.println("Empty Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("- + - + -");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("- + - + -");
        System.out.println(board[7] + " | " + board[9] + " | " + board[9]);
    }

    public void uc2_selectOption() {
        System.out.println(" ");
        System.out.println("Enter X or O to choose as your option");
        char option = sc.next().charAt(0);
        switch (option) {
            case 'X':
            case 'x':
                userInput = 'X';
                comInput = 'O';
                System.out.println("Your option is 'X' Computer option is 'O'");
                break;
            case 'o':
            case 'O':
                userInput = 'O';
                comInput = 'X';
                System.out.println("Your option is 'O' Computer option is 'X'");
                break;
            default:
                System.out.println("Choose either X or O");
                break;
        }
    }

    public void uc3_showBoard() {
        System.out.println(" ");
        System.out.println("Current Board");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("- + - + -");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("- + - + -");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    public void uc4_makeMove() {
        System.out.println(" ");
        System.out.println("Select a location to make a move");
        int move = sc.nextInt();
        if (board[move] == ' ') {
            board[move] = userInput;
            uc3_showBoard();
            uc7_checkWinner();
        } else {
            System.out.println("This location is not available");
            uc5_checkFreeSpaces();
            uc4_makeMove();
        }
    }

    public void uc5_checkFreeSpaces() {
        for (int i = 1; i < 10; i++) {
            if (board[i] == ' ') {
                freeSpaces.add(i);
            }
        }
        System.out.println("Available positions are:" + freeSpaces);
    }

    public int uc6_toss() {
        Random random = new Random();
        int toss = random.nextInt(2);
        System.out.println("For Toss, enter your choice: 1 or 0");
        int tossInput = sc.nextInt();
        int gameToss;
        if (toss == tossInput) {
            System.out.println(toss + "You win the toss. You play first");
            gameToss = 1;
        } else {
            System.out.println(toss + "You lost the toss. Computer plays first.");
            gameToss = 0;
        }
        return gameToss;
    }

    public void uc7_computerMove() {
        Random random = new Random();
        while(true){
            int comPos=random.nextInt(9)+1;
            if (board[comPos] == ' ') {
                board[comPos] = comInput;
                break;
            }
        }
        uc3_showBoard();
        uc7_checkWinner();
    }
    public void uc7_checkWinner() {
        ArrayList<Integer> remainingPositions = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            if (board[i] == ' ') {
                remainingPositions.add(i);
            }
        }
        if(remainingPositions.size()==0){
            System.out.println("GAME ENDED IN A DRAW");
        }
        if( (board[1]==userInput && board[2]==userInput && board[3]==userInput)||
                (board[4]==userInput && board[5]==userInput && board[6]==userInput)||
                (board[7]==userInput && board[8]==userInput && board[9]==userInput)||

                (board[1]==userInput && board[4]==userInput && board[7]==userInput)||
                (board[2]==userInput && board[5]==userInput && board[8]==userInput)||
                (board[3]==userInput && board[6]==userInput && board[9]==userInput)||

                (board[1]==userInput && board[5]==userInput && board[9]==userInput)||
                (board[3]==userInput && board[5]==userInput && board[7]==userInput) ) {

            System.out.println("CONGRATULATIONS.....PLAYER WON");
        }
        if( (board[1]==comInput && board[2]==comInput && board[3]==comInput)||
                (board[4]==comInput && board[5]==comInput && board[6]==comInput)||
                (board[7]==comInput && board[8]==comInput && board[9]==comInput)||

                (board[1]==comInput && board[4]==comInput && board[7]==comInput)||
                (board[2]==comInput && board[5]==comInput && board[8]==comInput)||
                (board[3]==comInput && board[6]==comInput && board[9]==comInput)||

                (board[1]==comInput && board[5]==comInput && board[9]==comInput)||
                (board[3]==comInput && board[5]==comInput && board[7]==comInput) ){
            System.out.println("COMPUTER WON.....WELL PLAYED");
        }

    }
}


