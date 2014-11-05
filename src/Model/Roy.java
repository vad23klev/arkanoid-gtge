package Model;

import Physics.*;
import View.RoyView;

/**
 * Класс для описания модели роя.
 * Created by vadim on 10/8/14.
 */
public class Roy  extends GameObjectModel {

    /**
     * Конструктор.
     * @param position - позиция роя в начальный момент времени.
     */
    public Roy(Position position) {
        this.mediator = new Mediator();
        this.view = new RoyView();
    }
}
