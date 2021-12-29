package BoardGame;
import java.util.Scanner;

import GameComponent.ChessGameComponent;
import GameComponent.GameComponent;
// import GameComponent.GameComponent.Memento;
import GameRules.ChessGameRules;

public class ChessBoardGame extends BoardGame{
    
    Scanner sc = new Scanner(System.in);
    // ChessGameComponent gameComponent;
    // ChessGameRules chessGameRules;
    public ChessBoardGame(String name, int numPlayers){
        super(name, numPlayers);
        this.gameComponent = new ChessGameComponent();
        this.gameRules = ChessGameRules.getInstance();

        // Get the name of all the players that are playing current game
        for (int counter = 0; counter<this.players.length; counter++) {
            System.out.println("Enter the name of the player "+counter+":");
            this.players[counter].setName(sc.nextLine());
            this.players[counter].setPlayer_number(counter);
        }

        // now we can assign pieces to players
        for (int i=0; i<8; i++){
            this.gameComponent.Board.getBoard(0, i).pieces.get(0).setBelongsTo(players[0]);
            this.gameComponent.Board.getBoard(1, i).pieces.get(0).setBelongsTo(players[0]);
            this.gameComponent.Board.getBoard(6, i).pieces.get(0).setBelongsTo(players[1]);
            this.gameComponent.Board.getBoard(7, i).pieces.get(0).setBelongsTo(players[1]);
        }

    }

    @Override
    public void play() {
        // Update the games played for each player
        // this.player1.setGamesPlayed(this.game);
        // this.player1.setGamesCount(this.game);
        // this.player2.setGamesPlayed(this.game);
        // this.player2.setGamesCount(this.game);


        System.out.println("Game begins");
        int winner = -1;
        int temp;
        
        while(winner==-1){
            
            // each player takes turn one by one
            for(int i = 0; i<this.players.length; i++){
                //save the game general components here
                GameComponent.Memento LastBoardState;
                LastBoardState = this.gameComponent.saveToMemento();


                // check Game rules if game ended or not
                temp = this.gameRules.checkGameEnd(this.gameComponent);
                
                // 2 represents game is not yet ended, 0 is win and 1 is draw
                if(temp==2){

                    // print the board
                    this.gameComponent.Board.print_Board();

                    System.out.println(this.players[i].getName()+"'s turn\nSelect the location of the piece you want to move: ");
                    int prow = sc.nextInt();
                    int pcol = sc.nextInt();
                    System.out.println(this.players[i].getName()+"'s turn\nEnter location you want to place it: ");
                    
                    int newrow = sc.nextInt();
                    int newcol = sc.nextInt();

                    // create move object
                    Move m = new Move();
                    m.setPrevLocationX(prow);
                    m.setPrevLocationY(pcol);
                    m.setCurrLocationX(newrow);
                    m.setCurrLocationY(newcol);
                    m.setByPlayer(players[i]);      
                    

                    // check if made move is valid or not
                    while(!this.gameRules.validateMove(m, this.gameComponent)){
                        System.out.println("Invalid move. Try again!");
                        System.out.println(this.players[i].getName()+"'s turn\nSelect the location of the piece you want to move: ");
                        prow = sc.nextInt();
                        pcol = sc.nextInt();
                        System.out.println(this.players[i].getName()+"'s turn\nEnter location you want to place it: ");
                        newrow = sc.nextInt();
                        newcol = sc.nextInt();

                        // create move object
                        m.setPrevLocationX(prow);
                        m.setPrevLocationY(pcol);
                        m.setCurrLocationX(newrow);
                        m.setCurrLocationY(newcol);
                        m.setByPlayer(players[i]);
                    }

                    // set the appropriate value ("X" or "O") to the board according to the player who played it
                    this.gameComponent.Board.setBoard(m);
                    
                    //ask for undo here
                    this.gameComponent.Board.print_Board();
                    System.out.println("Do you want to undo? [enter 1 for yes/0 for no]:");
                    int undo_int = sc.nextInt();
                    if (undo_int == 1){
                        
                        this.gameComponent.restoreFromMemento(LastBoardState);
                        i--;
                    }
                    
                    // add move to game state save

                }
                else{
                    if (temp == 0){

                        // check who played last move
                        if (i == 0)
                            winner = 1;
                        else
                            winner = 0;
                        
                        System.out.println("Game over. "+this.players[winner].getName()+" wins!");
                        break;
                    }
                    else{
                        winner = this.players.length;
                        System.out.println("Game over. Draw!");
                        break;
                    }
                    
                }
            }

        }
        
    }
    
}