package core;

import java.util.HashMap;
import java.util.ArrayList;

// Runs board logic.
public class Board
{
    private HashMap<String, Vertice> verticeGraph;
    private ArrayList<Player> players;

    public Board()
    {
        verticeGraph = new HashMap<String, Vertice>();
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    public void setPlayers(ArrayList<Player> players)
    {
        this.players = players;
    }

    private class Vertice
    {
        String label;
        ArrayList<Vertice> adjacencyList;
    }

    private class Tile
    {

    }
}
