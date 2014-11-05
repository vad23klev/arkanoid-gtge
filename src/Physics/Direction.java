package Physics;

/**
 * Created by Nikita on 11/5/2014.
 */
public class Direction {

    /** Направление выраженное через угол. */
    protected final Integer direction;

    /**
     * Конструктор.
     * @param dir - направление в градусах.
     */
    protected Direction(Integer dir) {
        this.direction = dir;
    }

    /**
     * Создать направление вправо.
     * @return направление вправо.
     */
    public static Direction Right() {
        return new Direction(0);
    }

    /**
     * Создать направление вверх.
     * @return направление вверх.
     */
    public static Direction Top() {
        return new Direction(90);
    }

    /**
     * Создать направление влево.
     * @return направление влево.
     */
    public static Direction Left() {
        return new Direction(180);
    }

    /**
     * Создать направление вниз.
     * @return направление вниз.
     */
    public static Direction Bottom() {
        return new Direction(270);
    }

    /**
     * Создать направление вправо-вверх.
     * @return направление вправо вверх.
     */
    public static Direction RightTop() {
        return new Direction(45);
    }

    /**
     * Создать направление вправо-вниз.
     * @return направление вправо-вниз.
     */
    public static Direction RightBottom() {
        return new Direction(315);
    }

    /**
     * Создать направление влево-вверх.
     * @return направление влево-вверх.
     */
    public static Direction LeftTop() {
        return new Direction(135);
    }

    /**
     * Создать направление влево-вниз.
     * @return направление влево вниз.
     */
    public static Direction LeftBottom() {
        return new Direction(225);
    }

    @Override
    public boolean equals(Object object) {
        return (object != null) && (this.direction == ((Direction)object).direction);
    }
}