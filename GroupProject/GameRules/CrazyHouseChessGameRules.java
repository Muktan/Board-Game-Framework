package GameRules;
import BoardGame.Move;
import GameComponent.GameComponent;


public class CrazyHouseChessGameRules extends ChessGameRules {
    // all the methos can be modified as per the game play you need
    private static CrazyHouseChessGameRules instance = new CrazyHouseChessGameRules();
    
    // @Override
    // protected boolean checkOutOfBound(Move move){
    // uncomment this method template to do your own stuff that differes from parent implementation!
    // }
    
    // @Override
    // protected int checkAlreadyOccupied(Move move, GameComponent gc){
    // uncomment this method template to do your own stuff that differes from parent implementation!
    // }

    // @Override
    // protected boolean checkPieceAtPrevMove(Move move, GameComponent gc){
    //     // uncomment this method template to do your own stuff that differes from parent implementation!
    // }

    // @Override
    // protected boolean checkPlayerPermissions(Move move, GameComponent gc){
    //     // uncomment this method template to do your own stuff that differes from parent implementation!
    // }

    // @Override
    // protected boolean checkPieceMovementCorrectness(Move move, GameComponent gc, Boolean killcondition){
    //     // uncomment this method template to do your own stuff that differes from parent implementation!

    // }

    //Validation method is itself template method
    @Override
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
    public static CrazyHouseChessGameRules getInstance() {
        return instance;
    }

    
}
