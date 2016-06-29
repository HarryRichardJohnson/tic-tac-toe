import java.util.Scanner;

/**
 * Created by HarryJohnson on 18/06/2016.
 */
public class TicTacToeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the game of Tic Tac Toe");
        //Declares a new gameboard
        GameBoard gb = new GameBoard();
        GameBoard.PopulateGameBoardEmpty(gb);
        GameBoard.PrintBoard(gb);

        boolean playing = true;
        Scanner keyboard = new Scanner(System.in);
        int move = 9;
        int keepGoing = 0;
        out:
        while(playing){
            //Loops until the win condition is met or there are no more spaces left to play
            boolean repeatTurnX = true;
            boolean repeatTurnY = true;
            while (repeatTurnX) {
                repeatTurnX = false;
                System.out.println("Player X turn");
                System.out.println("Choose a move (1-9)");
                move = keyboard.nextInt();
                keyboard.nextLine();
                if (move > (-1) && move < 10) {
                    if (GameBoard.MakePlay(move - 1, gb, 'X')) {
                        keepGoing++;
                    } else {
                        repeatTurnX = true;
                    }
                }
                GameBoard.PrintBoard(gb);
                playing = !GameBoard.WinTest(gb, 'X');
                if (!playing) {
                    repeatTurnX = false;
                    repeatTurnY = false;
                    playing = false;
                    System.out.println("1");
                }if(keepGoing == 9){
                    repeatTurnX = false;
                    repeatTurnY = false;
                    playing = false;
                }
            }
            while (repeatTurnY) {
                    repeatTurnY = false;
                    System.out.println("Player Y turn");
                    System.out.println("Choose a move (1-9)");
                    move = keyboard.nextInt();
                    keyboard.nextLine();
                    if (move > (-1) && move < 10) {
                        if (GameBoard.MakePlay(move - 1, gb, 'Y')) {
                            keepGoing++;
                        } else {
                            repeatTurnY = true;
                        }
                    }
                    GameBoard.PrintBoard(gb);
                    playing = !GameBoard.WinTest(gb, 'Y');
                    if (!playing) {
                        repeatTurnX = false;
                        repeatTurnY = false;
                        playing = false;
                        System.out.println("2");
                    }if(keepGoing == 9){
                    repeatTurnX = false;
                    repeatTurnY = false;
                        playing = false;
                    }
                }
            }
        }
    }
