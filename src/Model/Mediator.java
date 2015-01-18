package Model;

import Physics.Direction;
import Physics.Position;
import Physics.Speed;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Класс для обработки коллизий.
 * Created by vadim on 10/21/14.
 */
public class Mediator {

    /**
     * Обработка коллизий.
     * @param who - объект, который столкнулся.
     * @param with - объект, с которым столкнулись.
     * @param direction - направление столкновения.
     * @return результат обработки (true - произошла, false - не произошла).
     */
    public static boolean hit(GameObjectModel who, GameObjectModel with, Direction direction) {
        if (who.getClass() == Racket.class) {
            if (with.getClass() == Board.class) {

            }
        }
        else if (who.getClass() == Ball.class) {
            if (with.getClass() == Board.class) {
                switch (direction.Angle()) {
                    case 0: who.setSpeed(new Speed(-who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 90: who.setSpeed(new Speed(who.getSpeed().Horizontal, - who.getSpeed().Vertical)); break;
                    case 180: who.setSpeed(new Speed(- who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 270: who.destroy(); break;
                }
            }
            else if(with.getClass() == Racket.class) {
                hitRocketBall(who,with);
            }
        }
        return false;
    }

    /**
     * Обработка столкновения мяча и ракетки.
     * @param ball мяч.
     * @param racket ракетка.
     */
    protected static boolean hitRocketBall(GameObjectModel ball, GameObjectModel racket) {
        double cos = Math.abs((ball.getPosition().X + ball.getSprites().getSprites()[0].getWidth() / 2) -
                (racket.getPosition().X + racket.getSprites().getSprites()[0].getWidth() / 2)) /
                (racket.getSprites().getSprites()[0].getWidth() / 2);
        double sin = Math.sqrt(1 - Math.pow(cos,2));
        double len = Math.sqrt(Math.pow(ball.getSpeed().Horizontal,2) + Math.pow(ball.getSpeed().Vertical,2));
        ball.setSpeed(new Speed(-len*cos,-len*sin));
        return false;
    }
}
