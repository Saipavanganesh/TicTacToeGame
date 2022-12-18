import com.tictactoe.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe obj=new TicTacToe();
        obj.welcome();
        obj.uc1_gameStarts();
        obj.uc2_selectOption();
        obj.uc3_showBoard();
        obj.uc4_makeMove();
    }
}