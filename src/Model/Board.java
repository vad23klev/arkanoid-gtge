package Model;

import Physics.*;
import View.BoardView;

/**
 * Класс для описания модели доски.
 * Created by vadim on 10/8/14.
 */
public class Board  extends GameObjectModel {

    /**
     * Конструткор.
     */
    public Board(Position position) {
        this.view = new BoardView(this, position);
    }

    /**
     * Удаления модели с игрового поля.
     * @param object - модель для удаления.
     */
    protected void remove(GameObjectModel object) {

    }
}
