package Tests;

import Model.Ball;
import Model.Brick;
import Physics.Position;
import Physics.Speed;
import View.BallView;
import View.BrickView;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {

    @Test
    /** Тест коллизии шара с кирпичем, точка касания сверху шара. */
    public void TopCollisionWithBrick() {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания снизу шара. */
    public void BottomCollisionWithBrick() {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 8);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания слева шара. */
    public void LeftCollisionWithBrick() {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 1);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания справа шара. */
    public void RightCollisionWithBrick() {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 2);

        assertTrue(ball.equals(result));
    }

    @Test
    /**
     *
     */
    public void TopCollisionWithBoard() {

    }

    @Test
    /**
     *
     */
    public void BottomCollisionWithBoard() {

    }

    @Test
    /**
     *
     */
    public void LeftCollisionWithBoard() {

    }

    @Test
    /**
     *
     */
    public void RightCollisionWithBoard() {

    }

    @Test
    /**
     *
     */
    public void BottomCollisionWithRacket() {

    }

    @Test
    /**
     *
     */
    public void LeftCollisionWithRacket() {

    }

    @Test
    /**
     *
     */
    public void RightCollisionWithRacket() {

    }
}