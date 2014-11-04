package Model;

import View.GameObjectView;

/**
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectModel implements OnCollisionWith {

    protected GameObjectView view;
    protected Mediator mediator;

    public void destroy() {
        view.destroy();
    }

    public double[] getPosition() {

        return view.getPosition();
    }

    public void setPosition(double[] position) {
        view.setPosition(position);
    }

    public double[] getSpead() {

        return view.getSpead();
    }

    public void setSpead(double[] speed) {
        view.setSpead(speed);

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
