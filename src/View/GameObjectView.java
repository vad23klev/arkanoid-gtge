package View;

import Model.GameObjectModel;
import com.golden.gamedev.object.SpriteGroup;
import Physics.*;

/**
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectView {

    protected SpriteGroup sprites;
    protected GameObjectModel model;

    public void destroy() {

    }

    public Position getPosition() {
        return new Position(sprites.getSprites()[0].getX(), sprites.getSprites()[0].getY());
    }

    public void setPosition(Position position) {

    }

    public Speed getSpeed() {
        return null;
    }

    public void setSpeed(Speed speed) {

    }
}
