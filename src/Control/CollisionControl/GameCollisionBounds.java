package Control.CollisionControl;

import com.golden.*;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.collision.CollisionBounds;


/**
 * Created by vadim on 10/8/14.
 */
public class GameCollisionBounds extends CollisionBounds{

    public GameCollisionBounds(Background background) {
        super(background);
    }

    @Override
    public void collided(Sprite sprite) {

    }
}
