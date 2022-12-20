import com.tictactoe.TicTacToe;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TicTacToe obj=new TicTacToe();
        obj.welcome();
        int tossWon=obj.uc6_toss();
        obj.uc1_gameStarts();
        obj.uc2_selectOption();
        System.out.println(" ");
        int stopPlaying=0;
        do{
            if(tossWon==1){
                tossWon=0;
                obj.uc4_makeMove();
            }
            else{
                obj.uc7_computerMove();
                tossWon=1;
            }
            System.out.println("Choose an option");
            System.out.println("1.Check all the free spaces.\n2.Continue\n3.Exit");
            int option=sc.nextInt();
            switch (option) {
                case 1:
                    obj.uc5_checkFreeSpaces();
                    break;
                case 2:
                    break;
                case 3:
                    stopPlaying=1;
                    break;
                default:
                    System.out.println("Enter correct option");
                    break;
            }
        }while(stopPlaying!=1);
    }
}