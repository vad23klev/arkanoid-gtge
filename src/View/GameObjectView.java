package View;

import Model.GameObjectModel;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.SpriteGroup;
import Physics.*;

/**
 * Класс для описания игрового представления.
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectView {

    /** Контейнер стпрайтов. */
    protected SpriteGroup sprites;

    /**
     * Получить модель представления.
     * @return модель представления.
     */
    public GameObjectModel getModel() {
        return model;
    }

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

    public boolean isMySprite(Sprite sprite) {
        for (int i=0; i < sprites.getSprites().length ;i++) {
            if (sprite.equals(sprites.getSprites()[i])) {
                return true;
            }
        }
        return false;
    }
}
