package Control.CollisionControl;

import Game.Arkanoid;
import Model.GameObjectModel;
import Physics.Direction;
import com.golden.gamedev.object.Sprite;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by vadim on 1/18/15.
 */
public class GameAdvanceCollisionGroupBall extends GameAdvanceCollisionGroup {
    @Override
    public void collided(Sprite sprite, Sprite sprite2) {
        Map map = this.getStorage();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            GameObjectModel model = Arkanoid.board.findModelBySprite((Sprite) pairs.getKey());
            Arkanoid.mediator.hit(model, model, Direction.Top());
        }

    }
}
