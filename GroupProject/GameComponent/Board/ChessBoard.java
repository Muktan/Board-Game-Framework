package GameComponent.Board;
import java.util.ArrayList;

import BoardGame.Move;
import BoardGame.Player;

public class ChessBoard extends Board{
    // pawn = 1
    // bishop = 2
    // knight = 3
    // rook = 4
    // queen = 5
    // king = 6
    

    public ChessBoard(){
        int row = 8;
        int col = 8;
        this.board = new Square[row][col];

        //initialize all the values to 0

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                Square s = new Square();
                s.pieces = new ArrayList<Piece>();
                ChessPiece p = new ChessPiece();
                p.setPieceVal(0);
                s.pieces.add(p);
                this.board[i][j] = s;
            }
        }

        // set piece other than pawn
        this.board[0][0].pieces.get(0).setPieceVal(4);
        this.board[0][1].pieces.get(0).setPieceVal(3);
        this.board[0][2].pieces.get(0).setPieceVal(2);
        this.board[0][3].pieces.get(0).setPieceVal(5);
        this.board[0][4].pieces.get(0).setPieceVal(6);
        this.board[0][5].pieces.get(0).setPieceVal(2);
        this.board[0][6].pieces.get(0).setPieceVal(3);
        this.board[0][7].pieces.get(0).setPieceVal(4);
        
        // set pawns
        for(int i = 0; i< 8; i++){
            this.board[1][i].pieces.get(0).setPieceVal(1);
            this.board[6][i].pieces.get(0).setPieceVal(1);
        }

        // set piece
        this.board[7][0].pieces.get(0).setPieceVal(4);
        this.board[7][1].pieces.get(0).setPieceVal(3);
        this.board[7][2].pieces.get(0).setPieceVal(2);
        this.board[7][3].pieces.get(0).setPieceVal(5);
        this.board[7][4].pieces.get(0).setPieceVal(6);
        this.board[7][5].pieces.get(0).setPieceVal(2);
        this.board[7][6].pieces.get(0).setPieceVal(3);
        this.board[7][7].pieces.get(0).setPieceVal(4);
        

        
    }

    public Square getBoard(int row, int col){
        return board[row][col];
    }

    public void setPieces(Player p, int row, int col){

    }

    @Override
    public Square[][] getBoard() {
        return this.board;
    }

    @Override
    public void print_Board() {   
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                int val = this.board[i][j].pieces.get(0).getPieceVal();
                if (val == 0)
                    System.out.print('_');
                else
                    System.out.print(val);
                

            }
            System.out.print("\n");
            
        }
    }

    @Override
    public void setBoard(Move m) {
        int nrow = m.getCurrLocationX();
        int ncol = m.getCurrLocationY();
        // int val = board[nrow-1][ncol-1].pieces.get(0).getPieceVal();
        int prow = m.getPrevLocationX();
        int pcol = m.getPrevLocationY();
        // int val = board[prow-1][pcol-1].pieces.get(0).getPieceVal();

        board[nrow-1][ncol-1].pieces.set(0, board[prow-1][pcol-1].pieces.get(0));
        board[prow-1][pcol-1].pieces.set(0, new ChessPiece(0));
        
    }

    @Override
    public ChessBoard clone(){
        int row = 8;
        int col = 8;
        Square[][] new_board = new Square[row][col];

        //initialize all the values to 0

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                Square s = new Square();
                s.pieces = new ArrayList<Piece>();
                ChessPiece p = new ChessPiece();
                // first create clone of the piece
                Piece tocopy = this.board[i][j].pieces.get(0);
                p.belongsTo = tocopy.getBelongsTo();
                p.pieceVal = tocopy.getPieceVal();
                
                
                s.pieces.add(p);
                new_board[i][j] = s;
            }
        }
        ChessBoard cb = new ChessBoard();
        cb.board = new_board;
        return cb;
    }
}