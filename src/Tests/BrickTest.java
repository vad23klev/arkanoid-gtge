package Tests;

import Model.Brick;
import Physics.Position;
import View.GameObjectView;
import View.GameView;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrickTest {
    @Test
    /** Тест на удаление кирпича. */
    public void destroyBrick() throws Exception {
        Brick brick = new Brick(new Position(0,0));
        GameView view = new GameView();
        GameObjectView bview = brick.view();
        brick.destroy();
        assertTrue("Brick destroy test is failed",view.findModelByView(bview) == null);
    }
}