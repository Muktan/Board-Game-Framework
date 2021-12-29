package GameComponent.Board;
import BoardGame.Move;


public abstract class Board{
  public Square[][] board;

  public Board(){}
  public Board(int row,int col) {}
  
  // public abstract void setBoard(int row, int col, int val);
  public abstract void setBoard(Move m);
  public abstract Square[][] getBoard();
  public abstract Square getBoard(int row, int col);

  public abstract void print_Board();
  public abstract Board clone();
    
}
