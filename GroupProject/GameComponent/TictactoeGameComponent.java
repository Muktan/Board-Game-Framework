package GameComponent;
import GameComponent.Board.TictactoeBoard;

public class TictactoeGameComponent extends GameComponent {
    
    public TictactoeGameComponent(){
        this.Board = new TictactoeBoard(3, 3);
    }


    // public void setGeneralComponent(Board b){
    //     this.Board=b;
    // }

}
