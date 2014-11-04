package View;

import Model.GameObjectModel;
import com.golden.gamedev.object.SpriteGroup;

/**
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectView {

    protected SpriteGroup sprites;
    protected GameObjectModel model;

    public void destroy() {

    }

    public double[] getPosition() {
        double [] p = new double[2];
        p[0] = sprites.getSprites()[0].getX();
        p[1] = sprites.getSprites()[0].getY();
        return p;
    }

    public void setPosition(double[] position) {

    }

    public double[] getSpead() {

        return null;
    }

    public void setSpead(double[] spead) {

    }
}
