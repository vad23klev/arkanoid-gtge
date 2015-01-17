package Physics;

/**
 * Created by Nikita on 11/5/2014.
 */
public class Direction {

    /** Направление выраженное через угол. */
    protected final int angle;

    /**
     * Конструктор.
     * @param dir - направление в градусах.
     */
    protected Direction(int dir) {
        this.angle = dir;
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

    @Override
    public boolean equals(Object object) {
        return (object != null) && (this.angle == ((Direction)object).angle);
    }

    /**
     * Вернуть угол текущего направления.
     * @return угол.
     */
    public int Angle() {
        return this.angle;
    }
}