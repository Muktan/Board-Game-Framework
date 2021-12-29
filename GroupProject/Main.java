// import java.io.*;
import java.util.Scanner;

import BoardGame.TictactoeBoardGame;
import BoardGame.ChessBoardGame;
class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // we dont use the name part of the game anywhere
      
      TictactoeBoardGame gm = new TictactoeBoardGame("TicTacToe", 2);
      gm.play();
    
      ChessBoardGame gm1 = new ChessBoardGame("temp", 2);
      gm1.play();
      
      
      
      sc.close();
  }
}
