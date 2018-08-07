package core;

import java.awt.Color;

public class Player
{
    private String name;
    private Color color;
    private int points;
    private Hand hand;

    public Player(String name, Color color, int points, Hand hand)
    {
        this.name = name;
        this.color = color;
        this.points = points;
        this.hand = hand;
    }

    public Player()
    {
        this.name = null;
        this.color = null;
        this.points = 0;
        this.hand = null;
    }
}
