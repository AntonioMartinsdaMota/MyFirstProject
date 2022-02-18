package academy.mindswap;

import academy.mindswap.field.Field;
import academy.mindswap.gameobjects.fruit.Fruit;
import academy.mindswap.gameobjects.snake.Direction;
import academy.mindswap.gameobjects.snake.Snake;
import com.googlecode.lanterna.input.Key;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Game {

    private Snake snake;
    private Fruit fruit;
    private int delay;
    private final List<Integer> scoreList;

    public Game(int cols, int rows, int delay) {
        Field.init(cols, rows);
        snake = new Snake();
        this.delay = delay;
        this.scoreList = new LinkedList<>();
    }

    public void start() throws InterruptedException {

        generateFruit(); // uncomment when it's time to introduce fruits

        while (snake.isAlive()) {
            Thread.sleep(delay);
            Field.clearTail(snake);
            moveSnake();
            checkCollisions();
            Field.drawSnake(snake);
        }
    }

    private void generateFruit() {
        fruit = new Fruit();
        Field.drawFruit(fruit);
    }

    private void moveSnake() {

        Key k = Field.readInput();

        if (k != null) {
            switch (k.getKind()) {
                case ArrowUp:
                    snake.move(Direction.UP);
                    return;

                case ArrowDown:
                    snake.move(Direction.DOWN);
                    return;

                case ArrowLeft:
                    snake.move(Direction.LEFT);
                    return;

                case ArrowRight:
                    snake.move(Direction.RIGHT);
                    return;
            }
        }
        snake.move();
    }

    private void checkCollisions() {

        if (snake.getHead().getRow() == fruit.getPosition().getRow() && snake.getHead().getCol() == fruit.getPosition().getCol()) {
            snake.increaseSize();
            generateFruit();
            this.delay -= 2;
        }

        if (snake.getFullSnake().stream().skip(1).anyMatch(body -> body.equals(snake.getHead()))) {
            scoreList.add(Snake.getScore());
            getPR();
            snake.die();


        }

        if (snake.getHead().getCol() == 99 || snake.getHead().getRow() == 24 || snake.getHead().getCol() == 1 || snake.getHead().getRow() == 1) {
            scoreList.add(Snake.getScore());
            getPR();
            snake.die();
        }
    }

    public void getPR() {

        System.out.println("Your Personal Best is: " + scoreList.stream().sorted().findFirst().stream().collect(Collectors.toList()) + " points");


    }
}
