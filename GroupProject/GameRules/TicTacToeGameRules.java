package GameRules;

import BoardGame.Move;
import GameComponent.GameComponent;
import GameComponent.Board.Board;
import GameComponent.Board.Square;

public class TicTacToeGameRules extends GameRules{
    //singleton
    private static TicTacToeGameRules instance = new TicTacToeGameRules();
    
    @Override
    public boolean validateMove(Move move, GameComponent gcComponent) {
        // validate move requires the current move made
        
        if(gcComponent.Board.getBoard(move.currLocationX-1,move.currLocationY-1).pieces.get(0).getPieceVal()==0) return true;
        else return false;
        
        // return true;
        //if the move above 3*3 is added the Invalid move isn't handled
        // if(g1.Board.getBoard(row-1,col-1)==0) return true;
        // else return false;
    }

    // public boolean IsValid(int row, int col, GameComponent gameComponent) {
    //     //Not the final method. Temp use only
    //     if(gameComponent.Board.getBoard(row-1,col-1).pieces.get(0).getPieceVal()==0) return true;
    //     else return false;
    // }

    
    // instead of boolean return value changed it to int because if it is a game end we want to also know why game ended (draw or win or some other reason)
    @Override
    public int checkGameEnd(GameComponent g1) {
        if((g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(0,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(0,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(1,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(1,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(1,0).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(2,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(2,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(2,0).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,0).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,0).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(0,1).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,1).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,1).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,2).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,0).pieces.get(0).getPieceVal()!=0) ||
            (g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()==g1.Board.getBoard(1,1).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()==g1.Board.getBoard(2,0).pieces.get(0).getPieceVal() && g1.Board.getBoard(0,2).pieces.get(0).getPieceVal()!=0))
        {
           return 0;
        }
        else if (this.check_board_full(g1.Board)) return 1;
        else return 2;        
    }
    
    public boolean check_board_full(Board board) {
        Square[][] board_mat = board.getBoard();
        for(int i=0;i<board_mat.length;i++) {
            for(int j=0;j<board_mat.length;j++) {
                if(board_mat[i][j].pieces.get(0).getPieceVal()==0) return false;
            }
        }
        return true;
    }
    // singleton
    public static TicTacToeGameRules getInstance() {
        return instance;
    }
}