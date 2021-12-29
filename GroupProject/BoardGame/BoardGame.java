package BoardGame;
import GameComponent.GameComponent;
import GameRules.GameRules;


public abstract class BoardGame {

  protected String name; // not at all required
  protected Player[] players;
  protected GameComponent gameComponent;
  protected GameRules gameRules;

  public BoardGame(){}
  public BoardGame(String name) {
    this.name = name;
  }

  public BoardGame(String name, int numPlayers) {
    this.name = name;
    this.players = new Player[numPlayers];
    for(int i=0; i<this.players.length; i++){
      this.players[i] = new Player();
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public abstract void play();

}
