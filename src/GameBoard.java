/**
 * Created by HarryJohnson on 18/06/2016.
 */
public class GameBoard {
    char[] gameboard;

    public GameBoard(){
        //Constructor
        this.gameboard = new char[10];
    }

    public static void PopulateGameBoardEmpty(GameBoard gb){
        //Fills the gameboard with blank spaces
        for (int i = 0; i < 9;i++){
            gb.gameboard[i] = ' ';
            gb.gameboard[9] = 'a';
        }
    }

    public static void PrintBoard(GameBoard gb) {
        //Prints the gameboard in a 3x3 format
        int k = 1;
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(k+"["+gb.gameboard[i*3 +j]+"]");
                k++;
            }
            System.out.println();
        }
    }

    public static boolean MakePlay(int move, GameBoard gb, char player){
        //Returns true if the requested  move is valid
        boolean success = false;
        if (gb.gameboard[move] == ' ') {
            gb.gameboard[move] = player;
            success = true;
        }else{
            System.out.println("This move cannot be made, please try again.");
        }
        return success;
    }

    public static boolean WinTest(GameBoard gb, char player){
        //Returns true if the criteria for a win is met
        boolean winner = false;
        if (gb.gameboard[0] == player && gb.gameboard[1] == player && gb.gameboard[2] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[3] == player && gb.gameboard[4] == player && gb.gameboard[5] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[6] == player && gb.gameboard[7] == player && gb.gameboard[8] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[0] == player && gb.gameboard[3] == player && gb.gameboard[6] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[1] == player && gb.gameboard[4] == player && gb.gameboard[7] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[2] == player && gb.gameboard[5] == player && gb.gameboard[8] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[0] == player && gb.gameboard[4] == player && gb.gameboard[8] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        else if (gb.gameboard[2] == player && gb.gameboard[4] == player && gb.gameboard[6] == player){
            winner = true;
            System.out.println("Player "+player+" wins");
        }
        return winner;
    }
}
