package GameComponent.Board;
import java.util.ArrayList;

import BoardGame.Move;

public class TictactoeBoard extends Board {

    public TictactoeBoard(int row, int col) {
        
        this.board = new Square[row][col];
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                // Piece temp = new Piece();
                 //new TictactoePiece();
                Square s = new Square();
                s.pieces = new ArrayList<Piece>();
                TictactoePiece p = new TictactoePiece();
                p.setPieceVal(0);
                s.pieces.add(p);
                this.board[i][j] = s;
            }
        }

        
    }

    public TictactoeBoard() {
    }

    public Square[][] getBoard() {
        return this.board;
    }
    public Square getBoard(int row, int col) {
        return this.board[row][col];
    }
  
  
    //tictactoe
    public void setBoard(Move m) {
        int row = m.getCurrLocationX();
        int col = m.getCurrLocationY();
        int val = m.getNewVal();
        
        board[row-1][col-1].pieces.get(0).setPieceVal(val);
    }

    public void print_Board() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                char c = '_';
                
                if(this.getBoard(i,j).pieces.get(0).getPieceVal()==1) c = 'X';
                else if (this.getBoard(i,j).pieces.get(0).getPieceVal()==2) c = 'O';
              System.out.print(c);
            }
            System.out.print("\n");
        }
    }
    @Override
    public TictactoeBoard clone(){
        int row = 3;
        int col = 3;
        Square[][] new_board = new Square[row][col];
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                // Piece temp = new Piece();
                 //new TictactoePiece();
                Square s = new Square();
                s.pieces = new ArrayList<Piece>();
                TictactoePiece p = new TictactoePiece();
                Piece tocopy = this.board[i][j].pieces.get(0);
                p.PieceVal = tocopy.getPieceVal();
                p.belongsTo = tocopy.getBelongsTo();

                s.pieces.add(p);
                new_board[i][j] = s;
            }
        }
        TictactoeBoard tb = new TictactoeBoard();
        tb.board = new_board;
        return tb;
    }
    
}
