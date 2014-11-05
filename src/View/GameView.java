package View;

import Model.GameObjectModel;
import com.golden.gamedev.Game;
import com.golden.gamedev.object.Sprite;

import java.awt.*;

/**
 * Класс для описания отображения игры.
 * Created by vadim on 10/8/14.
 */
public class GameView extends Game {

    /** Контейнер с моделями. */
    private GameObjectModel[] objects;

    /** Контейнер с представлениями. */
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

    /**
     * Основная функция для запуска игры.
     * @param args - аргументы запуска.
     */
    public static void main(String args[]) {

    }

    /**
     * Найти представление по спрайту.
     * @param sprite - спрайт для поиска.
     * @return представление соответствующее спрайту.
     */
    public GameObjectView findViewBySprite(Sprite sprite) {
        for(int i = 0; i < views.length; i++) {
            if (views[i].isMySprite(sprite)) {
                return views[i];
            }
        }
        return null;
    }

    /**
     * Найти модель по представлению.
     * @param view - представление для поиска.
     * @return модель соответствующую представлению.
     */
    public GameObjectModel findModelByView(GameObjectView view) {
        return view.getModel();
    }
}
