package Control.CollisionControl;

import com.golden.*;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.collision.CollisionBounds;


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

    }
}
