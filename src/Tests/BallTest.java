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
        this.ball = new Ball(new Position(0,0), new Speed(0,0));
    }

    @Before
    public void racket() { this.racket = new Racket(new Position(0,0)); }

    @Before
    public void roy() { this.roy = new Roy(new Position(0,0)); }

    @Before
    public void board() { this.board = new Board(new Position(0,0)); }

    @Test
    /** Тест обобщенных методов, точка касания сверху шара. */
    public void TopCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точка касания снизу шара. */
    public void BottomCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точка касания слева шара. */
    public void LeftCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точка касания справа шара. */
    public void RightCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точки касания сверху и слева шара. */
    public void TopLeftCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точки касания слева и снизу шара. */
    public void BottomLeftCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точки касания снизу и справа шара. */
    public void BottomRightCollision() throws Exception {
    }

    @Test
    /** Тест обобщенных методов, точки касания справа и сверху шара. */
    public void TopRightCollision() throws Exception {
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания по центру ракетки. */
    public void CenterCollisionWithRacket() throws Exception {
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания слевой стороны ракетки.. */
    public void LeftCollisionWithRacket() throws Exception {
    }

    @Test
    /** Тест коллизии шара и ракетки, точка касания справой стороны ракетки. */
    public void RightCollisionWithRacket() throws Exception {
    }

    @Test
    /** Тест коллизии шара и роя */
    public void CollisionWithRoy() throws Exception {
    }

    @Test
    /** Тест коллизии шара и края доски, точка касания снизу шара */
    public void CollisionWithBottomBoard() throws Exception {
    }
}
