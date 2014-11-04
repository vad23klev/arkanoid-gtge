package Model;

import Physics.*;
import View.BrickView;

/**
 * Created by vadim on 10/8/14.
 */
public class Brick extends GameObjectModel{

    public Brick(Position position) {
        this.mediator = new Mediator();
        this.view = new BrickView();
    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }
    
}
