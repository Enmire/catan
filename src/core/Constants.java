package core;

import java.awt.*;

public class Constants
{
    // Player names.
    public enum Player
    {
        ONE, TWO, THREE, FOUR, FIVE, SIX
    }

    // Colors.
    public static Color RED = new Color(153, 0, 0);
    public static Color BLUE = new Color(0, 0, 153);
    public static Color WHITE = new Color(204, 204, 204);
    public static Color ORANGE = new Color(204, 102, 0);
    public static Color BROWN = new Color(102, 51, 0);
    public static Color GREEN = new Color(0, 102, 0);

    // Resource types.
    public enum Resource
    {
        WOOD, BRICK, SHEEP, WHEAT, ORE
    }

    public enum Commodity
    {
        PAPER, CLOTH, COIN
    }

    // Tile types.
    public enum Tile
    {
        FOREST, QUARRY, PASTURE, FIELD, MOUNTAIN, DESERT, SEA, GOLD
    }
}
