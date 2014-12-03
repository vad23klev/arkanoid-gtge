package Model;

import Physics.*;
import View.BrickView;

/**
 * Класс для описания модели кирпича.
 * Created by vadim on 10/8/14.
 */
public class Brick extends GameObjectModel{

    /**
     * Конструктор.
     * @param position - позиция кирпича в начальный момент времени.
     */
    public Brick(Position position) {
        this.view = new BrickView();
    }
}
