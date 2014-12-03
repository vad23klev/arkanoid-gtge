package Model;

import View.RoyElementView;
import Physics.*;

/**
 * Класс для описания модели элемента роя.
 * Created by vadim on 10/8/14.
 */
public class RoyElement extends GameObjectModel{

    protected final Roy parent;

    /**
     * Конструктор.
     */
    public RoyElement(Roy parent, Position position) {
        this.view = new RoyElementView(this, position);
        this.parent = parent;
    }

    /**
     * Возвращаем рой.
     */
    public Roy getParent() {
        return parent;
    }
}
