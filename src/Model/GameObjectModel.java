package Model;

import Game.Arkanoid;
import Physics.Direction;
import Physics.Position;
import Physics.Speed;
import View.GameObjectView;
import com.golden.gamedev.object.SpriteGroup;

/**
 * Класс для описания игровой модели.
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectModel {

    /** Представление модели */
    protected GameObjectView view;

    /** Показатель состояния игровой модели */
    protected Boolean destroy = false;

    /**
     * Деструктор игровой модели.
     */
    public void destroy() {
        Arkanoid.keylistener.remove(this);
        this.destroy = true;
        this.view.destroy();
        this.view = null;
    }

    /**
     * Получить состояние разрушения игровой модели.
     * @return разрушение игровой модели.
     */
    public Boolean isDestroy()
    {
        return this.destroy;
    }

    /**
     * Получить позицию ишровой модели.
     * @return текущая позиция.
     */
    public Position getPosition() {
        return view.getPosition();
    }

    /**
     * Изменить позицию игровой модели.
     * @param position - новая позиция.
     */
    public void setPosition(Position position) {
        view.setPosition(position);
    }

    /**
     * Получить скорость игровой модели.
     * @return текущая скорость.
     */
    public Speed getSpeed() {
        return view.getSpeed();
    }

    /**
     * Изменить скорость игровой модели.
     * @param speed - новая скорость.
     */
    public void setSpeed(Speed speed) {
        view.setSpeed(speed);
    }

    public int getId() {
        return this.view().getSprites().getSprites()[0].getID();
    }


    @Override
    public boolean equals(Object object) {
        int first = this.view().getSprites().getSprites()[0].getID();
        int second = ((GameObjectModel)object).view().getSprites().getSprites()[0].getID();
        return  (this.view().getSprites().getSprites()[0].getID() == ((GameObjectModel)object).view().getSprites().getSprites()[0].getID());
    }

    /**
     * @return представление модели.
     */
    public GameObjectView view() {
        return view;
    }

    /**
     * @return группу спрайтов модели.
     */
    public SpriteGroup getSprites() {
        return this.view.getSprites();
    }

    public void keyUp(int code) {

    }

    public void keyDown(int code) {

    }
}
