package academy.mindswap.gameobjects.fruit;

import academy.mindswap.field.Position;

public class Fruit {
    private Position position;
    int maxCol = 98;
    int minCol = 2;
    int maxRow = 23;
    int minRow = 2;



    public Fruit() {
        int randomCol = (int) (Math.random()*(maxCol-minCol + 1) + minCol);
        int randomRow = (int) (Math.random()*(maxRow-minRow + 1) + minRow);
        this.position =  new Position(randomCol,randomRow);

    }
    public Position getPosition() {

       return position;
    }
}
