package GameRules;
import BoardGame.Move;
import BoardGame.Player;
import GameComponent.GameComponent;


public class ChessGameRules extends GameRules {
    private static ChessGameRules instance = new ChessGameRules();

    

    protected boolean checkOutOfBound(Move move){
        int x = move.getCurrLocationX()-1;
        int y = move.getCurrLocationY()-1;
        return !(x<0 || x>7 || y<0 || y>7);
        
    }
    protected int checkAlreadyOccupied(Move move, GameComponent gc){
        int x = move.getPrevLocationX()-1;
        int y = move.getPrevLocationY()-1;
        int nx = move.getCurrLocationX()-1;
        int ny = move.getCurrLocationY()-1;
        Player PieceBelongsTo = gc.Board.getBoard()[x][y].pieces.get(0).getBelongsTo();
        
        if (gc.Board.getBoard()[nx][ny].pieces.get(0).getPieceVal() != 0){
            Player PieceAtNextLocationPlayer = gc.Board.getBoard()[nx][ny].pieces.get(0).getBelongsTo();
            if (PieceBelongsTo == PieceAtNextLocationPlayer){
                //obstruction
                return 0;
            }
            else{
                // kill_condition
                return 1;
            }
        }
        return 2;
    }

    protected boolean checkPieceAtPrevMove(Move move, GameComponent gc){
        int x = move.getPrevLocationX()-1;
        int y = move.getPrevLocationY()-1;
        if (gc.Board.getBoard()[x][y].pieces.get(0).getPieceVal() != 0){
            return true;
        }
        return false;
    }

    protected boolean checkPlayerPermissions(Move move, GameComponent gc){
        int x = move.getPrevLocationX()-1;
        int y = move.getPrevLocationY()-1;
        Player PieceBelongsTo = gc.Board.getBoard()[x][y].pieces.get(0).getBelongsTo();
        Player MovePlayedBy = move.getByPlayer();
        if (PieceBelongsTo == MovePlayedBy){
            return true;
        }
        else{
            return false;
        }
    }
    protected boolean checkPieceMovementCorrectness(Move move, GameComponent gc, Boolean killcondition){
        int x = move.getPrevLocationX()-1;
        int y = move.getPrevLocationY()-1;
        int nx = move.getCurrLocationX()-1;
        int ny = move.getCurrLocationY()-1;
        int currentPiece = gc.Board.getBoard()[x][y].pieces.get(0).getPieceVal();
        int player_number = move.getByPlayer().getPlayer_number();
        
        
        // pawn = 1
        // bishop = 2
        // knight = 3
        // rook = 4
        // queen = 5
        // king = 6
        if (currentPiece == 1){
            if (player_number == 0){
                // player 1 so direction of pawn should be down and straight
                if (nx>x){
                    // moving straight down
                    // this is valid
                    if (!killcondition && (nx-x==1 || (x == 1 && nx ==3)) && ny == y){
                        return true;
                    }
                    else if(killcondition && nx-x == 1 && (ny-y == 1 || ny-y == -1) ){
                        //moving cross 1 step to kill
                        return true;
                    }
                }
                return false;
            }
            else{
                if (nx<x){
                    // moving straight down
                    // this is valid
                    if (!killcondition && (nx-x==-1 || (x == 6 && nx ==4)) && ny == y){
                        return true;
                    }
                    else if(killcondition && nx-x == -1 && (ny-y == 1 || ny-y == -1) ){
                        //moving cross 1 step to kill
                        return true;
                    }
                }
                return false;
            }    
        }
        else if(currentPiece == 2){
            // check for bishop
            return true;
        }
        else if(currentPiece == 3){
            // check for knight
            return true;
        }
        else if(currentPiece == 4){
            //check for rook
            return true;
        }
        else if(currentPiece == 5){
            //check for queen
            return true;
        }
        else if(currentPiece == 6){
            //check for king
            return true; 
        }
        else{
            return true;
        }

    }


    @Override
    public boolean validateMove(Move move, GameComponent g1) {
        // perform all the general validation methods that can remain same across all the child classes
        if (!checkOutOfBound(move)){
            return false;
        }
        if(!checkPieceAtPrevMove(move, g1)){
            return false;
        }
        if (!checkPlayerPermissions(move,g1)){
            return false;
        }
        int temp = checkAlreadyOccupied(move, g1);
        if (temp == 0){
            return false;
        }
        if (!checkPieceMovementCorrectness(move, g1, temp==1)){
            return false;
        }
        if (!checkMiscellaneousRules(move, g1)){
            return false;
        }
        return true;
    }

    public boolean checkMiscellaneousRules(Move move, GameComponent g1) {
        return true;
    }

    @Override
    public int checkGameEnd(GameComponent g1) {
        return 2;
        // checking game end is fairly complicated
        // so currently keeping this open end game
    }
    

    // singleton
    public static ChessGameRules getInstance() {
        return instance;
    }
    
}
