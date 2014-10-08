package Model;

/**
 * Created by vadim on 10/8/14.
 */
public interface OnCollisionWith {

    public void CollisionWithBrick(GameObjectModel opponent, int side);
    public void CollisionWithBall(GameObjectModel opponent, int side);
    public void CollisionWithRacket(GameObjectModel opponent, int side);
    public void CollisionWithRoy(GameObjectModel opponent, int side);
}