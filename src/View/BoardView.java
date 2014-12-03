package View;

import Model.GameObjectModel;
import Physics.Position;

/**
 * Класс для описания представления доски.
 * Created by vadim on 10/8/14.
 */
public class BoardView extends GameObjectView {

    public BoardView(GameObjectModel model, Position position) {
        super(model, position);
    }
}
