package Model;

import View.GameObjectView;
import Physics.*;

/**
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectModel implements OnCollisionWith {

    protected GameObjectView view;
    protected Mediator mediator;

    public void destroy() {
        view.destroy();
        this.view = null;
        this.mediator = null;
    }

    public Position getPosition() {
        return view.getPosition();
    }

    public void setPosition(Position position) {
        view.setPosition(position);
    }

    public Speed getSpeed() {
        return view.getSpeed();
    }

    public void setSpeed(Speed speed) {
        view.setSpeed(speed);
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

    @Override
    public boolean equals(Object object) {
        return  (this.view != null) &&
                (((GameObjectModel)object).view != null) &&
                (this.getPosition().equals(((Ball)object).getPosition())) &&
                (this.getSpeed().equals(((Ball)object).getSpeed()));
    }
}
