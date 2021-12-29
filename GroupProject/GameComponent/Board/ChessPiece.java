package GameComponent.Board;
import BoardGame.Player;

public class ChessPiece extends Piece{
    public String color;
    public String type;
    

    ChessPiece(){
        
    }
    ChessPiece(int val){
        pieceVal = val;
    }
    public void assignToPlayer(Player p){
        belongsTo=p;
    }

    public void setType(String t){
        type=t;
    }

    public void setColor(String col){
        color=col;

    }

    @Override
    public int getPieceVal() {
        return this.pieceVal;
    }

    @Override
    public void setPieceVal(int pieceVal) {
        this.pieceVal = pieceVal;
    }

    @Override
    public Player getBelongsTo() {
        return this.belongsTo;
    }

    @Override
    public void setBelongsTo(Player belongsTo) {
        this.belongsTo = belongsTo;

    }

}
