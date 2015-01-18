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
    protected final SpriteGroup sprites;

    protected final GameObjectModel model;

    public GameObjectView(GameObjectModel model, SpriteGroup sprites) {
        this.sprites = sprites;
        this.model = model;
    }

    public void destroy() {
        for (int i = 0; i < sprites.getSize(); i++) {
            sprites.getSprites()[i].setActive(false);
        }
    }

    /**
     * Получить модель представления.
     * @return модель представления.
     */
    public GameObjectModel getModel() {
        return model;
    }

    public Position getPosition() {
        return new Position(sprites.getSprites()[0].getX(), sprites.getSprites()[0].getY());
    }

    public void setPosition(Position position) {
        for (int i = 0; i < this.sprites.getSize(); i++) {
            sprites.getSprites()[i].setX(position.X);
            sprites.getSprites()[i].setY(position.Y);
        }
    }

    public Speed getSpeed() {
        return new Speed(sprites.getSprites()[0].getHorizontalSpeed(),sprites.getSprites()[0].getVerticalSpeed());
    }

    public void setSpeed(Speed speed) {
        for (int i = 0; i < sprites.getSize(); i++) {
            sprites.getSprites()[i].setSpeed(speed.Horizontal, speed.Vertical);
        }
    }

    public boolean isMySprite(Sprite sprite) {
        for (int i=0; i < sprites.getSprites().length ;i++) {
            if (sprite.equals(sprites.getSprites()[i]) && sprites.getSprites()[i].isActive()) {
                return true;
            }
        }
        return false;
    }

    public SpriteGroup getSprites() {
        return this.sprites;
    }

    /**
     * Добавить спрайты в группу.
     * @param group добавить спрайты представления в группу.
     */
    public void addStritesToGroup(SpriteGroup group) {
        for (int i = 0; i < sprites.getSize(); i++) {
            group.add(sprites.getSprites()[i]);
        }
    }
}
