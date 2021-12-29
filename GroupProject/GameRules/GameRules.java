package GameRules;

import BoardGame.Move;
import GameComponent.GameComponent;

public abstract class GameRules{
    public GameRules(){
    }
    // add template method here
    public abstract boolean validateMove(Move move, GameComponent g1);
    public abstract int checkGameEnd(GameComponent g1);
}