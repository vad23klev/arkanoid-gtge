package Control.CollisionControl;

import Game.Arkanoid;
import Model.GameObjectModel;
import Physics.Direction;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.collision.AdvanceCollisionGroup;

/**
 * Класс для обнаружения коллизий между объектами кроме доски.
 * Created by vadim on 10/8/14.
 */
public class GameAdvanceCollisionGroup extends AdvanceCollisionGroup {

    @Override
    public void collided(Sprite sprite, Sprite sprite2) {
        GameObjectModel model = Arkanoid.board.findModelBySprite(sprite);
        GameObjectModel model2 = Arkanoid.board.findModelBySprite(sprite2);
        Arkanoid.mediator.hit(model, model2, Direction.Top());

    }
}
