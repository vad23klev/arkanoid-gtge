package Physics;

/**
 * Created by Nikita on 11/4/2014.
 */
public class Speed {

    /** Скорость вдоль горизонтальной оси. */
    public final double Horizontal;

    /** Скорость вдоль вертикальной оси. */
    public final double Vertical;

    /**
     * Конструктор.
     * @param horizontal - скорость вдоль горизонтальной оси.
     * @param vertical - скорость вдоль вертикальной оси.
     */
    public Speed(double horizontal, double vertical) {
        this.Horizontal = horizontal;
        this.Vertical = vertical;
    }

    @Override
    public boolean equals(Object object) {
        return (object != null) &&
                (this.Horizontal == ((Speed)object).Horizontal) &&
                (this.Vertical == ((Speed)object).Vertical);
    }
}
