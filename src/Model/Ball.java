package Model;

import View.BallView;
import javafx.util.Pair;

import Physics.*;

/**
 * Класс для описания модели шара.
 * Created by vadim on 10/8/14.
 */
public class Ball extends GameObjectModel{

    /**
     * Конструктор.
     * @param position - позиция шара в начальный момент времени.
     */
    public Ball(Position position) {
        this.view = new BallView();
        this.view.setPosition(position);
    }
}
