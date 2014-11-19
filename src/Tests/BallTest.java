package Tests;

import Model.Ball;
import Model.Board;
import Model.Racket;
import Model.Roy;
import Physics.Direction;
import Physics.Position;
import Physics.Speed;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BallTest {

    private Ball ball;

    private Racket racket;

    private Roy roy;

    private Board board;

    @Before
    public void ball() {
        this.ball = new Ball(new Position(0,0));
    }

    @Before
    public void racket() { this.racket = new Racket(new Position(0,0)); }

    @Before
    public void roy() { this.roy = new Roy(new Position(0,0)); }

    @Before
    public void board() { this.board = new Board(); }

    @Test
    /** Тест обобщенных методов, точка касания сверху шара. */
    public void TopCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.Top());
        Assert.assertTrue("Speed not equal. Top collision(Ball).", ball.getSpeed().equals(new Speed(1, -1)));
    }

    @Test
    /** Тест обобщенных методов, точка касания снизу шара. */
    public void BottomCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,-1));
        ball.hit(Direction.Bottom());
        Assert.assertTrue("Speed not equal. Bottom collision(Ball).",ball.getSpeed().equals(new Speed(1,1)));
    }

    @Test
    /** Тест обобщенных методов, точка касания слева шара. */
    public void LeftCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.Left());
        Assert.assertTrue("Speed not equal. Left collision(Ball).",ball.getSpeed().equals(new Speed(-1,1)));
    }

    @Test
    /** Тест обобщенных методов, точка касания справа шара. */
    public void RightCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(-1,1));
        ball.hit(Direction.Right());
        Assert.assertTrue("Speed not equal. Right collision(Ball).",ball.getSpeed().equals(new Speed(1,1)));
    }

    @Test
    /** Тест обобщенных методов, точки касания сверху и слева шара. */
    public void TopLeftCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(-1,1));
        ball.hit(Direction.LeftTop());
        Assert.assertTrue("Speed not equal. TopLeft collision(Ball).",ball.getSpeed().equals(new Speed(1,-1)));
    }

    @Test
    /** Тест обобщенных методов, точки касания слева и снизу шара. */
    public void BottomLeftCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.LeftBottom());
        Assert.assertTrue("Speed not equal. BottomLeft collision(Ball).",ball.getSpeed().equals(new Speed(-1,-1)));
    }

    @Test
    /** Тест обобщенных методов, точки касания снизу и справа шара. */
    public void BottomRightCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.RightBottom());
        Assert.assertTrue("Speed not equal. BottomRight collision(Ball).",ball.getSpeed().equals(new Speed(-1,-1)));
    }

    @Test
    /** Тест обобщенных методов, точки касания справа и сверху шара. */
    public void TopRightCollision() throws Exception {
        ball();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.RightTop());
        Assert.assertTrue("Speed not equal. TopRight collision(Ball).",ball.getSpeed().equals(new Speed(-1,-1)));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания по центру ракетки. */
    public void CenterCollisionWithRacket() throws Exception {
        ball();
        racket();
        ball.setSpeed(new Speed(1, 1));
        ball.CollisionWith(racket, Direction.Bottom());
        Assert.assertTrue("Speed not equal. Center collision(Ball)", ball.getSpeed().equals(new Speed(1, -1)));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания слевой стороны ракетки.. */
    public void LeftCollisionWithRacket() throws Exception {
        ball();
        racket();
        ball.setSpeed(new Speed(1, 1));
        ball.CollisionWith(racket, Direction.Bottom());
        Assert.assertTrue("Speed not equal. Left collision(Ball)", ball.getSpeed().equals(new Speed(1, -1)));
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания справой стороны ракетки. */
    public void RightCollisionWithRacket() throws Exception {
        ball();
        racket();
        ball.setSpeed(new Speed(1, 1));
        ball.CollisionWith(racket, Direction.Bottom());
        Assert.assertTrue("Speed not equal. Right collision(Ball)", ball.getSpeed().equals(new Speed(1, -1)));
    }

    @Test
    /** Тест коллизии шара и роя */
    public void CollisionWithRoy() throws Exception {
        ball();
        roy();
        ball.setSpeed(new Speed(1,1));
        Assert.assertTrue("Ball not destroy.", ball.isDestroy());
    }

    @Test
    /** Тест коллизии шара и края доски, точка касания снизу шара */
    public void CollisionWithBottomBoard() throws Exception {
        ball();
        board();
        ball.setSpeed(new Speed(1,1));
        ball.hit(Direction.Bottom());
        Assert.assertTrue("Ball not destroy.", ball.isDestroy());
    }
}