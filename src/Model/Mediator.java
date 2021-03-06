package Model;

import Game.Arkanoid;
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

    protected static ArrayList<MeditorListener> List;
    public Mediator() {
        List = new ArrayList<MeditorListener>();
    }

    public void addListener(MeditorListener listener) {
        if (listener != null) {
            List.add(listener);
        }
    }

    protected static void notifyListeners() {
        for (int i = 0; i < List.size(); i++) {
            List.get(i).update();
        }
    }

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
                if (who.getPosition().X <= 0) { who.setPosition(new Position(0,who.getPosition().Y));}
                else if (who.getPosition().X >= Arkanoid.width - 150) { who.setPosition(new Position(Arkanoid.width - 150,who.getPosition().Y));}


            }
        }
        else if (who.getClass() == Ball.class) {
            if (with.getClass() == Board.class) {
                switch (direction.Angle()) {
                    case 0: who.setSpeed(new Speed(-who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 90: who.setSpeed(new Speed(who.getSpeed().Horizontal, - who.getSpeed().Vertical)); break;
                    case 180: who.setSpeed(new Speed(- who.getSpeed().Horizontal, who.getSpeed().Vertical)); break;
                    case 270: who.destroy(); notifyListeners(); break;
                }
            }
            else if(with.getClass() == Racket.class) {
                hitRocketBall(who,with,direction);
            }
            else if(with.getClass() == Ball.class) {
                who.setSpeed(new Speed(-who.getSpeed().Horizontal, -who.getSpeed().Vertical));
            }
        }
        return false;
    }

    /**
     * Обработка столкновения мяча и ракетки.
     * @param ball мяч.
     * @param racket ракетка.
     */
    protected static boolean hitRocketBall(GameObjectModel ball, GameObjectModel racket, Direction direction) {
        int dir = 1;
        if (ball.getSpeed().Horizontal < 0) { dir = -1;}
        if (direction.equals(Direction.Top())) {
            double cos = Math.abs((ball.getPosition().X + ball.getSprites().getSprites()[0].getWidth() / 2) -
                    (racket.getPosition().X + racket.getSprites().getSprites()[0].getWidth() / 2)) /
                    (racket.getSprites().getSprites()[0].getWidth() / 2);
            if (cos > 1.0) {cos = 0.98;}
            else if (cos > -1.0) {cos = -0.98;}
            double sin = Math.sqrt(1 - Math.pow(cos, 2));
            double len = Math.sqrt(Math.pow(ball.getSpeed().Horizontal, 2) + Math.pow(ball.getSpeed().Vertical, 2));
            ball.setSpeed(new Speed(dir * Math.abs(len * cos), -len * sin));
        }   else {
            ball.setSpeed(new Speed(-ball.getSpeed().Horizontal, ball.getSpeed().Vertical));
        }
        return false;
    }
}
