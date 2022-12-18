import com.tictactoe.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TicTacToe obj=new TicTacToe();
        obj.welcome();
        obj.uc1_gameStarts();
        obj.uc2_selectOption();
        System.out.println(" ");
        int stopPlaying=0;
        do{
            System.out.println("Choose an option");
            System.out.println("1.Show current board.\n2.Check all the free spaces.\n3.Make your move\n4.Exit");
            int option=sc.nextInt();
            switch (option) {
                case 1:
                    obj.uc3_showBoard();
                    break;
                case 2:
                    obj.uc5_checkFreeSpaces();
                    break;
                case 3:
                    obj.uc4_makeMove();
                    break;
                case 4:
                    stopPlaying=1;
                default:
                    System.out.println("Enter correct option");
                    break;
            }
        }while(stopPlaying!=1);
    }
}