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
        for (int i = 0; i < sprites.getSize(); i++) {
            sprites.getSprites()[i].setActive(false);
        }
    }

    public Position getPosition() {
        return new Position(sprites.getSprites()[0].getX(), sprites.getSprites()[0].getY());
    }

    public void setPosition(Position position) {
        sprites.getSprites()[0].setX(position.X);
        sprites.getSprites()[0].setY(position.Y);
    }

    public Speed getSpeed() {
        return new Speed(sprites.getSprites()[0].getHorizontalSpeed(),sprites.getSprites()[0].getVerticalSpeed());
    }

    public void setSpeed(Speed speed) {
        for (int i = 0; i < sprites.getSize(); i++) {
            sprites.getSprites()[i].setSpeed(speed.Horizontal, speed.Vertical);
        }
    }

    public GameObjectView(GameObjectModel model, Position position) {
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
