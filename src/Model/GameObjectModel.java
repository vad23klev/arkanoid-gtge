package Model;

import View.GameObjectView;
import Physics.*;

/**
 * Класс для описания игровой модели.
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectModel implements OnCollisionWith {

    /** Представление модели */
    protected GameObjectView view;

    /** Посредник между обработчиком коллизий и игровой моделью */
    protected Mediator mediator;

    /**
     * Деструктор игровой модели.
     */
    public void destroy() {
        view.destroy();
        this.view = null;
        this.mediator = null;
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
    public void CollisionWith(Brick opponent, Direction direction) {

    }

    @Override
    public void CollisionWith(Ball opponent, Direction direction) {

    }

    @Override
    public void CollisionWith(Racket opponent, Direction direction) {

    }

    @Override
    public void CollisionWith(Roy opponent, Direction direction) {

    }

    @Override
    public void CollisionWith(Board opponent, Direction direction) {

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
            hitByVerticalWall();
        } else if (direct.Angle() == Direction.Bottom().Angle() || direct.Angle() == Direction.Top().Angle()) {
            hitByHorizontalWall();
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
     * Функция-реакция на удар с горизонтальной стеной.
     */
    protected void hitByHorizontalWall() {

    }

    /**
     * Функция-реакция на удар с вертикальной стеной.
     */
    protected void hitByVerticalWall() {

    }
}
