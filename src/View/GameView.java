package View;
import Model.GameObjectModel;
import com.golden.gamedev.Game;
import com.golden.gamedev.object.Sprite;

import java.awt.*;

/**
 * Created by vadim on 10/8/14.
 */
public class GameView extends Game {

    private GameObjectModel[] objects;
    private GameObjectView[] views;

    @Override
    public void initResources() {

    }

    @Override
    public void update(long l) {

    }

    @Override
    public void render(Graphics2D graphics2D) {

    }


    public static void main(String args[]) {

    }


    public GameObjectView find_view(Sprite sprite) {
        return null;
    }

    public GameObjectModel find_model(GameObjectView view) {
        return null;
    }
}
