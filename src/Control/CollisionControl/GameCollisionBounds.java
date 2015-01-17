package Control.CollisionControl;

import Game.Arkanoid;
import Model.GameObjectModel;
import Physics.Direction;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.collision.CollisionBounds;
import javafx.util.Pair;

import java.util.ArrayList;


/**
 * Класс для обнаружения коллизий объектов с краями доски.
 * Created by vadim on 10/8/14.
 */
public class GameCollisionBounds extends CollisionBounds{

    /**
     * Конструктор.
     * @param background - задний фон поля.
     */
    public GameCollisionBounds(Background background) {
        super(background);
    }

    @Override
    public void collided(Sprite sprite) {
        GameObjectModel model = Arkanoid.board.findModelBySprite(sprite);
        if (isCollisionSide(RIGHT_COLLISION)) {
            Arkanoid.mediator.hit(model, Arkanoid.board, Direction.Right());
        }
        else if (isCollisionSide(TOP_COLLISION)) {
            Arkanoid.mediator.hit(model, Arkanoid.board, Direction.Top());
        }
        else if (isCollisionSide(LEFT_COLLISION)) {
            Arkanoid.mediator.hit(model, Arkanoid.board, Direction.Left());
        }
        else if (isCollisionSide(BOTTOM_COLLISION)) {
            Arkanoid.mediator.hit(model, Arkanoid.board, Direction.Bottom());
        }
    }
}
