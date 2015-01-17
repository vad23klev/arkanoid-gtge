package Model;

import Physics.Direction;
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
                switch (direction.Angle()) {
                    case 0: who.setSpeed(new Speed(-who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 90: who.setSpeed(new Speed(who.getSpeed().Horizontal, - who.getSpeed().Vertical)); break;
                    case 180: who.setSpeed(new Speed(- who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 270: who.setSpeed(new Speed(who.getSpeed().Horizontal, -who.getSpeed().Vertical)); break;
                }
            }
        }
        return false;
    }
}
