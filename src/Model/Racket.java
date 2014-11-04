package Model;

import Physics.*;
import View.RacketView;

/**
 * Created by vadim on 10/8/14.
 */
public class Racket  extends GameObjectModel {

    public Racket(Position position) {
        this.mediator = new Mediator();
        this.view = new RacketView();
    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }
    
}
