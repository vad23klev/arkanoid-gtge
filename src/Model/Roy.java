package Model;

import Physics.Position;
import View.RoyView;

/**
 * Класс для описания модели роя.
 * Created by vadim on 10/8/14.
 */
public class Roy  extends GameObjectModel {

    final int MAX_ELEMENT_COUNT = 3;
    protected RoyElement[] elements;
    /**
     * Конструктор.
     * @param position - позиция роя в начальный момент времени.
     */
    public Roy(Position position) {
        this.elements = new RoyElement[MAX_ELEMENT_COUNT];
        for (int i = 0; i < MAX_ELEMENT_COUNT; i++) {
            this.elements[i] = null;
        }
        this.view = new RoyView(this, position);
    }

    /**
     * Слияние двух и более роев в 1.
     * @param others - массив роев для слияния с текущим.
     */
    public void Merge(Roy[] others) {
        for (int i = 0; i < others.length; i++ ) {
            for (int j = 0; j < others[i].getElements().length; j++) {
                if (!CheckOverflow()) {
                    this.Append(others[i].getElements()[j]);
                } else {
                    j = others[i].getElements().length;
                    i = others.length;
                }
            }
            others[i].destroy();
        }

    }

    /**
     * Добавления нового элемента в рой.
     * @param element - элемент попадающий в рой.
     */
    public void Append(GameObjectModel element) {
        if(!this.CheckOverflow()) {
            for (int i = 0; i < MAX_ELEMENT_COUNT; i++) {
                if (elements[i] == null) {
                    elements[i] = new RoyElement(this, element.getPosition());
                }
            }
        }
    }

    /**
     * Проверка переполнения роя.
     */
    public boolean CheckOverflow() {
        if(elements[MAX_ELEMENT_COUNT -1] != null) {
            this.destroy();
            return true;
        }
        return false;
    }

    /**
     * Возвращаем эелементы роя.
     * @return - массив элементов роя.
     */
    public RoyElement[] getElements() {
        return this.elements;
    }
}
