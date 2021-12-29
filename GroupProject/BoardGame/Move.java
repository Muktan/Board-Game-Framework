package BoardGame;
import GameComponent.Board.Piece;

public class Move {
    public int currLocationX;
    public int currLocationY;
    int prevLocationX;
    int prevLocationY;
    Piece pieceMoved;
    Player byPlayer;
    int moveValue;
    
    public int getPrevLocationX() {
        return prevLocationX;
    }

    public void setPrevLocationX(int prevLocationX) {
        this.prevLocationX = prevLocationX;
    }

    public int getPrevLocationY() {
        return prevLocationY;
    }

    public void setPrevLocationY(int prevLocationY) {
        this.prevLocationY = prevLocationY;
    }

    public int getCurrLocationX() {
        return currLocationX;
    }

    public void setCurrLocationX(int currLocationX) {
        this.currLocationX = currLocationX;
    }

    public int getCurrLocationY() {
        return currLocationY;
    }

    public void setCurrLocationY(int currLocationY) {
        this.currLocationY = currLocationY;
    }

    public int getNewVal() {
        return moveValue;
    }

    public void setNewVal(int cellValue) {
        this.moveValue = cellValue;
    }

    public Player getByPlayer() {
        return byPlayer;
    }

    public void setByPlayer(Player byPlayer) {
        this.byPlayer = byPlayer;
    }
}
