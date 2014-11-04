package Model;

import Physics.*;
import View.RoyView;

/**
 * Created by vadim on 10/8/14.
 */
public class Roy  extends GameObjectModel {

    public Roy(Position position) {
        this.mediator = new Mediator();
        this.view = new RoyView();
    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }
    
}
