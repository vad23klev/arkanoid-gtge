package Model;

import Physics.*;
import View.RacketView;

/**
 * Класс для описания модели ракетки.
 * Created by vadim on 10/8/14.
 */
public class Racket  extends GameObjectModel {

    /**
     * Конструктор.
     * @param position - позиция ракетки в начальный момент времени.
     */
    public Racket(Position position) {
        this.view = new RacketView();
    }
}
