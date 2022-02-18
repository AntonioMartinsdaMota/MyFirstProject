package academy.mindswap.gameobjects.snake;

import academy.mindswap.field.Position;

import java.util.LinkedList;
import java.util.List;

public class Snake {

    private final static int SNAKE_INITIAL_SIZE = 3;
    private Direction direction;
    private boolean alive;
    private final LinkedList<Position> snakePosition = new LinkedList<>();
    private static int score = 0;

    public Snake() {
        this.direction = Direction.UP;
        this.alive = true;
        snakePosition.add(new Position(25, 10));
        snakePosition.add(new Position(25, 11));
        snakePosition.add(new Position(25, 12));
    }

    public void increaseSize() {
        //if(getHead().getRow() == getTail().getRow())
        snakePosition.add(new Position(getTail().getCol(),getTail().getRow()));
        score++;
        }


    public static int getScore() {
        return score;
    }

    public void move(Direction direction) {
        this.direction = direction;


       Position newHeadPosition;
        switch (direction) {

            case UP -> {
                newHeadPosition = new Position(getHead().getCol(), getHead().getRow() - 1);
               // snakePosition.add(new Position(getHead().getCol(), getHead().getRow() - 1));
               // snakePosition.removeLast();
            }
            case DOWN -> {
                newHeadPosition = new Position(getHead().getCol(), getHead().getRow() + 1 );
                //snakePosition.add(new Position(getHead().getCol(), getHead().getRow() + 1 ));
                //snakePosition.removeLast();
            }
            case RIGHT -> {
                newHeadPosition =new Position(getHead().getCol() + 1, getHead().getRow());
                ///snakePosition.add(new Position(getHead().getCol() + 1, getHead().getRow()));
                //snakePosition.removeLast();
            }

            default -> {
                newHeadPosition = new Position(getHead().getCol() - 1, getHead().getRow());
                //snakePosition.add(new Position(getHead().getCol() + 1, getHead().getRow()));
               // snakePosition.removeLast();
            }
        }
        Position tempPosition = null;
        //snakePosition.set(0,newHeadPosition);
        for (Position position: snakePosition) {
            Position actualPosition = new Position(position.getCol(), position.getRow());
            Position futurePosition = tempPosition == null ? newHeadPosition : tempPosition;


            position.setCol(futurePosition.getCol());
            position.setRow(futurePosition.getRow());
           // snakePosition.set( snakePosition.indexOf(position), tempPosition == null ? newHeadPosition : tempPosition);

            tempPosition = actualPosition;

        }

    }

    public void move() {
        move(direction);
    }

    public void die() {
            alive = false;
        System.out.println("Game is Over\n" + "Your Score is: " + score + " points");

        }


    public boolean isAlive() {

        return alive;
    }

    public Position getHead() {
        return snakePosition.getFirst();
    }

    public Position getTail() {
        return snakePosition.getLast();

    }

    public LinkedList<Position> getFullSnake() {

        return snakePosition;
    }

    public int getSnakeSize() {
        return snakePosition.size();
    }
}

