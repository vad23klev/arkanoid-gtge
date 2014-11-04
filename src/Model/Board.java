package Model;

import Physics.*;
import View.BoardView;

/**
 * Created by vadim on 10/8/14.
 */
public class Board  extends GameObjectModel {

    public Board(Position position) {
        this.mediator = new Mediator();
        this.view = new BoardView();
    }

    @Override
    public void CollisionWith(Ball opponent, int side) {

    }

}
