package GameComponent.Board;
import BoardGame.Player;


public abstract class Piece{

    int pieceVal;
    public Player belongsTo;
    // public int[] location;
    // public Player belongsTo;
    public abstract int getPieceVal();
    public abstract void setPieceVal(int pieceVal);
    public abstract Player getBelongsTo();
    public abstract void setBelongsTo(Player belongsTo);
    // public abstract void setPieceLocation(int[] loc);
    // public abstract void assignToPlayer(Player player);
}