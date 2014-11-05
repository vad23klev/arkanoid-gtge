package Tests;

import Model.*;
import Physics.Position;
import Physics.Speed;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BallTest {

    @Test
    /** Тест коллизии шара с кирпичем, точка касания сверху шара. */
    public void TopCollisionWithBrick() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания снизу шара. */
    public void BottomCollisionWithBrick() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 8);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания слева шара. */
    public void LeftCollisionWithBrick() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 1);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара с кирпичем, точка касания справа шара. */
    public void RightCollisionWithBrick() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(brick, 2);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и доски, точка касания сверху шара. */
    public void TopCollisionWithBoard() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Board board = new Board(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(board, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и доски, точка касания снизу шара. */
    public void BottomCollisionWithBoard() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Board board = new Board(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(board, 8);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и доски, точка касания слева шара. */
    public void LeftCollisionWithBoard() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Board board = new Board(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(board, 1);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и доски, точка касания справа шара. */
    public void RightCollisionWithBoard() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Board board = new Board(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(board, 2);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания сверху шара. */
    public void TopCollisionWithRacket() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Racket racket = new Racket(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(racket, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания снизу шара. */
    public void BottomCollisionWithRacket() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Racket racket = new Racket(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(racket, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания слева шара. */
    public void LeftCollisionWithRacket() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Racket racket = new Racket(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(racket, 1);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания справа шара. */
    public void RightCollisionWithRacket() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Racket racket = new Racket(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(racket, 2);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и роя, точка касания сверху шара */
    public void TopCollisionWithRoy() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Roy roy = new Roy(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(roy, 8);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и роя, точка касания снизу шара */
    public void BottomCollisionWithRoy() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Roy roy = new Roy(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(roy, 4);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и роя, точка касания снизу шара */
    public void LeftCollisionWithRoy() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Roy roy = new Roy(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(roy, 1);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и роя, точка касания справа шара */
    public void RightCollisionWithRoy() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Roy roy = new Roy(new Position(0,0));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        ball.CollisionWith(roy, 2);

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и двух кирпичей, точки касания сверху и слева шара. */
    public void TopLeftCollisionWithBricks() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick1 = new Brick(new Position(10,10));
        Brick brick2 = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        //TODO - вызов коллизии.

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и двух кирпичей, точки касания слева и снизу шара. */
    public void LeftBottomCollisionWithBricks() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick1 = new Brick(new Position(10,10));
        Brick brick2 = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        //TODO - вызов коллизии.

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и двух кирпичей, точки касания снизу и справа шара. */
    public void BottomRightCollisionWithBricks() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick1 = new Brick(new Position(10,10));
        Brick brick2 = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        //TODO - вызов коллизии.

        assertTrue(ball.equals(result));
    }

    @Test
    /** Тест коллизии шара и двух кирпичей, точки касания справа и сверху шара. */
    public void RightTopCollisionWithBricks() throws Exception {
        Ball ball = new Ball(new Position(10,10), new Speed(10,10));
        Brick brick1 = new Brick(new Position(10,10));
        Brick brick2 = new Brick(new Position(10,10));
        Ball result = new Ball(new Position(10,10), new Speed(10,10));

        //TODO - вызов коллизии.

        assertTrue(ball.equals(result));
    }
}