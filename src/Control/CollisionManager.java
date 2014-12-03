package Control;

import Model.Mediator;

/**
 * Класс для обнаружения коллизий.
 * Created by vadim on 10/8/14.
 */
public class CollisionManager {

    /* Связь обработчика коллизий и модели*/
    protected Mediator mediator= null;

    /**
     * Проверка на коллизии.
     */
    public void check_collision() {

    }
    /**
     * Конструктор.
     */
    public CollisionManager(Mediator mediator) {
        this.mediator = mediator;
    }
}
