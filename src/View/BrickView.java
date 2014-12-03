package View;

import Model.GameObjectModel;
import Physics.Position;

/**
 * Класс для описания представления кирпича.
 * Created by vadim on 10/8/14.
 */
public class BrickView extends GameObjectView {

    public BrickView(GameObjectModel model, Position position) {
        super(model, position);
    }
}
