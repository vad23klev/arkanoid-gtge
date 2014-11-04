package Model;

import View.BallView;
import javafx.util.Pair;

import Physics.*;

/**
 * Created by vadim on 10/8/14.
 */
public class Ball extends GameObjectModel{

    public Ball(Position position, Speed speed) {
        this.mediator = new Mediator();
        this.view = new BallView();
    }

    @Override
    public void CollisionWith(Brick opponent, int side) {

    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }

    @Override
    public void CollisionWith(Racket opponent, int side) {

    }

    @Override
    public void CollisionWith(Roy opponent, int side) {

    }

    @Override
    public void CollisionWith(Board opponent, int side) {

    }
}
