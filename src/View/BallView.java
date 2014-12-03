package View;

import Model.GameObjectModel;
import Physics.Position;

/**
 * Класс для описания представления шара.
 * Created by vadim on 10/8/14.
 */
public class BallView extends GameObjectView {

    public BallView(GameObjectModel model, Position position) {
        super(model, position);
    }
}
