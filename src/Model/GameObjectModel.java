package Model;

import View.GameObjectView;
import Physics.*;

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


    @Override
    public boolean equals(Object object) {
        return  (this.view != null) &&
                (((GameObjectModel)object).view != null) &&
                (this.getPosition().equals(((Ball)object).getPosition())) &&
                (this.getSpeed().equals(((Ball)object).getSpeed()));
    }

    /**
     * Функция-реакция на удар.
     * @param direct - направление удара.
     */
    public void hit(Direction direct) {
        if (direct.Angle() == Direction.Left().Angle() || direct.Angle() == Direction.Right().Angle()) {
            hitByVertical();
        } else if (direct.Angle() == Direction.Bottom().Angle() || direct.Angle() == Direction.Top().Angle()) {
            hitByHorizontal();
        } else {
            hitByCorner(direct);
        }
    }

    /**
     * Функция-реакция удар с уголком.
     * @param direct- направление удара.
     */
    protected void hitByCorner(Direction direct) {

    }

    /**
     * Функция-реакция на удар с горизонталью.
     */
    protected void hitByHorizontal() {

    }

    /**
     * Функция-реакция на удар с вертикалью.
     */
    protected void hitByVertical() {

    }

    /**
     * @return представление модели.
     */
    public GameObjectView view() {
        return view;
    }
}
