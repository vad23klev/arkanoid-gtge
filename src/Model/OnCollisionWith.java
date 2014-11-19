package Model;

import Physics.Direction;

/**
 * Интерфейс методов обработки коллизий.
 * Created by vadim on 10/8/14.
 */
public interface OnCollisionWith {
    public void CollisionWith(Brick opponent, Direction direction);
    public void CollisionWith(Ball opponent, Direction direction);
    public void CollisionWith(Racket opponent, Direction direction);
    public void CollisionWith(Roy opponent, Direction direction);
    public void CollisionWith(Board opponent, Direction direction);
}