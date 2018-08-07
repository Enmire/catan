package catan;

import core.Game;
import userInterface.CatanUi;

public class Catan
{
    public static void main(String[] args)
    {
        Game game = new Game();
        CatanUi catanUi = new CatanUi(game);
    }
}
