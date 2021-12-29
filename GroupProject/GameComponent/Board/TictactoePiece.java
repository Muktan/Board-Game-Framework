package GameComponent.Board;
import BoardGame.Player;

public class TictactoePiece extends Piece{
    int PieceVal;
    Player belongsTo;
    TictactoePiece(){

    }
    TictactoePiece(int val, Player p){
        belongsTo = p;
        PieceVal = val;
    }
    public int getPieceVal() {
        return PieceVal;
    }
    public void setPieceVal(int pieceVal) {
        PieceVal = pieceVal;
    }
    public Player getBelongsTo() {
        return belongsTo;
    }
    public void setBelongsTo(Player belongsTo) {
        this.belongsTo = belongsTo;
    }
    

}
