package Model;

import View.RoyElementView;
import Physics.*;

/**
 * Класс для описания модели элемента роя.
 * Created by vadim on 10/8/14.
 */
public class RoyElement extends GameObjectModel{

    /**
     * Конструктор.
     */
    public RoyElement() {
        this.mediator = new Mediator();
        this.view = new RoyElementView();
    }
}
