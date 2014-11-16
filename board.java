/**
 * Created by ryancoughlan on 12/11/2014.
 */
import java.util.*;

public class board {
    private String[][] cBoard;
    private ArrayList<piece> pieces;
    private Iterator<piece> it;

    public board(){
        cBoard = new String[8][8];
        pieces = new ArrayList<piece>(24);
        it = pieces.iterator();

    }

    public void printBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i % 2 == j % 2) {
                    cBoard[i][j] = "[ ]";
                } else{
                    cBoard[i][j] = "[x]";
                }
            }
        }
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                System.out.print(cBoard[i][j]);
            }
            System.out.println("");
        }
    }

    public void printList(){

        int i = 0;
        while(it.hasNext()){
            if(i <= 12){
                piece x = (piece) it.next();
                x.setColour("W");
                String y = x.getColour();
                System.out.println(y);
            }
            else{
                piece x = (piece) it.next();
                x.setColour("B");
                String y = x.getColour();
                System.out.println(y);
            }
            i += 1;
        }
        //iterate through arraylist and set the first half as white "w", second half as black "B"
    }
//
//    public void fillBoard(){
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 8; j++){
//                if(i < 3 && ((i+1)*(j+1)) % 2 == 1){
//                    cBoard[i][j] = pieces.whitePieces.colour;
//                }
//            }
//        }
//    }
}
