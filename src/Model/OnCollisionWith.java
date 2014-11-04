package Model;

/**
 * Created by vadim on 10/8/14.
 */
public interface OnCollisionWith {
    public void CollisionWith(Brick opponent, int side);
    public void CollisionWith(Ball opponent, int side);
    public void CollisionWith(Racket opponent, int side);
    public void CollisionWith(Roy opponent, int side);
    public void CollisionWith(Board opponent, int side);
}