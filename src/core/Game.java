package core;

import java.awt.Color;
import java.util.ArrayList;
// Needs a dialog box import.

// Runs game logic.
public class Game
{
    private ArrayList <Player> players;
    private Board board;
    private Player currentPlayer;

    public Game()
    {
        initializeGame();
    }

    private void initializeGame()
    {
        board = new Board();
        createPlayers();
        board.setPlayers(players);
    }

    private void createPlayers()
    {
        players = new ArrayList();


    }
}
