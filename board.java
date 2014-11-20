/**
 * Created by ryancoughlan on 12/11/2014.
 */
import java.util.*;

public class board {
    private String[][] cBoard;

    public board() {
        cBoard = new String[8][8];

    }

    public void genBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2) {
                    cBoard[i][j] = "[ ]";
                } else {
                    cBoard[i][j] = "[x]";
                }
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(cBoard[i][j]);
            }
            System.out.println("");
        }
    }



    public void fillBoard() {
        int x = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                x+=1;
                if (i % 2 != j % 2 && x <= 24) {
                    cBoard[i][j] = "[B]";
                    //change so that it is getting a piece on there
                } else if(i % 2 != j % 2 && x >= 41){
                    cBoard[i][j] = "[W]";
                }
            }
        }
    }
}
