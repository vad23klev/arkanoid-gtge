package Model;

import Game.Arkanoid;
import Physics.Position;
import Physics.Speed;
import View.BoardView;
import View.GameObjectView;
import com.golden.gamedev.object.Sprite;

import java.util.ArrayList;

/**
 * Класс для описания модели доски.
 * Created by vadim on 10/8/14.
 */
public class Board  extends GameObjectModel {

    private ArrayList<GameObjectModel> models = new ArrayList<GameObjectModel>();

    /**
     * Конструткор.
     */
    public Board(Position position) {
        this.view = new BoardView(this, position);
        Arkanoid.playfield.addGroup(this.getSprites());
        this.models.add(new Racket(new Position((Arkanoid.width - 150) / 2, Arkanoid.height - 50)));
        this.models.add(new Ball(new Position((Arkanoid.width - 25) / 2, Arkanoid.height - 75), new Speed(0, 0)));
    }

    /**
     * Удаления модели с игрового поля.
     * @param object - модель для удаления.
     */
    public void remove(GameObjectModel object) {
        models.remove(object);
    }

    public GameObjectView findViewBySprite(Sprite sprite) {
        for(GameObjectModel model : this.models) {
            if (model.view().isMySprite(sprite)) {
                return model.view();
            }
        }
        return null;
    }

    public GameObjectModel findModelBySprite(Sprite sprite) {
        for(GameObjectModel model : this.models) {
            if (model.view().isMySprite(sprite)) {
                return model;
            }
        }
        return null;
    }

    /**
     * Модели на доске.
     * @return массив моделей.
     */
    public ArrayList<GameObjectModel> models() {
        return this.models;
    }
}
