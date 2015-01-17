package View;

import Model.GameObjectModel;
import Physics.Position;
import com.golden.gamedev.object.SpriteGroup;

/**
 * Класс для описания представления элемента роя.
 * Created by vadim on 10/8/14.
 */
public class RoyElementView extends GameObjectView {

    public RoyElementView(GameObjectModel model, Position position) {
        super(model, new SpriteGroup("RoyElement"));
    }
}
