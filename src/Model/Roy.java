package Model;

import Physics.*;
import View.RoyView;

/**
 * Класс для описания модели роя.
 * Created by vadim on 10/8/14.
 */
public class Roy  extends GameObjectModel {

    /**
     * Конструктор.
     * @param position - позиция роя в начальный момент времени.
     */
    final int MAX_ELEMENT_COUNT = 3;
    /**
     * Конструктор.
     * @param position - позиция роя в начальный момент времени.
     */
    public Roy(Position position) {
        this.mediator = new Mediator();
        this.view = new RoyView();
    }

    /**
     * Слияние двух и более роев в 1.
     * @param others - массив роев для слияния с текущим.
     */
    public void Merge(Roy[] others) {

    }

    /**
     * Конструктор.
     * @param element - элемент попадающий в рой.
     */
    public void Append(GameObjectModel element) {

    }
}
