package Model;

import javafx.util.Pair;

/**
 * Класс для обработки коллизий.
 * Created by vadim on 10/21/14.
 */
public class Mediator {

    /**
     * Обработка коллизий.
     * @param objects - контейнер объектов участвующих в коллизии.
     * @return результат обработки (true - произошла, false - не произошла).
     */
    public boolean hit(Pair<GameObjectModel,GameObjectModel>[] objects) {
        return false;
    }
}
