package Model;

import View.RoyElementView;
import Physics.*;

/**
 * Created by vadim on 10/8/14.
 */
public class RoyElement extends GameObjectModel{

    public RoyElement(Position position) {
        this.mediator = new Mediator();
        this.view = new RoyElementView();
    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }

}
