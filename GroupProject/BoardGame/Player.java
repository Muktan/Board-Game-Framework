package BoardGame;
public class Player {
  private int Player_number;

  public int getPlayer_number() {
    return Player_number;
  }
  
  public void setPlayer_number(int player_number) {
    Player_number = player_number;
  }

  private String name;
  private int age;
  private String[] games_played = new String[5];
  private int[] games_count = new int[5];
  //private int[] rating; // ratings for various games // Not implemented

  public Player(){};

  public Player(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGamesPlayed(String games_played) {
    for(int i=0;i<5;i++) {
      if(this.games_played[i]==games_played) return;
    }
    for(int i=0;i<5;i++) {
      if(this.games_played[i]== null) {
        this.games_played[i] = games_played;
        return;
      }
    }
  }

  public void setGamesCount(String game) {
    int index=-1;
    for(index = 0;index<5;index++) {
      if(game==this.games_played[index]) break;
    }
    if(index==-1)return;
    games_count[index] = games_count[index]+1;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void getGamesPlayed() {
    for(int i=0;i<5;i++) {
      if(games_played[i]== null) break;
      System.out.println(i+1+". "+games_played[i]);
    }
    return;
  }

  public int getGamesCount(String game) {
    int index = -1;
    for(index = 0;index<5;index++) {
      if(game==this.games_played[index])break;
    }
    if(index==-1) System.out.println("Game not played yet!");
    return games_count[index];
  }
}
