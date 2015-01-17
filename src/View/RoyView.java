package View;

import Model.GameObjectModel;
import Physics.Position;
import com.golden.gamedev.object.SpriteGroup;

/**
 * Класс для описания представления роя.
 * Created by vadim on 10/8/14.
 */
public class RoyView extends GameObjectView {

    public RoyView(GameObjectModel model, Position position) {
        super(model, new SpriteGroup("Roy"));
    }
}
