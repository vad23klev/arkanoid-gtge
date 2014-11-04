package Physics;

/**
 * Created by Nikita on 11/4/2014.
 */
public class Position {

    /** Позиция по оси x. */
    public final double X;

    /** Позиция по оси y. */
    public final double Y;

    /**
     * Конструктор
     * @param x - координата по оси x.
     * @param y - координата по оси y.
     */
    public Position(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public boolean equals(Object object) {
        return (this.X == ((Position)object).X) && (this.Y == ((Position)object).Y);
    }
}
