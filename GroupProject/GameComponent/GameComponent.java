package GameComponent;
import GameComponent.Board.Board;

public class GameComponent {
    public Board Board;

    public GameComponent(){
    }

    public Memento saveToMemento() {
        return new Memento(this.Board);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.Board = memento.getSaveBoard();
    }

    public static class Memento{
        private Board mBoard;

        public Memento(Board board){
            
            try{
                mBoard = board.clone();    
            }
            catch(Exception exception){
                System.out.println(exception);
            }
                
        }

        private Board getSaveBoard(){
            return mBoard;
        }
    }
}