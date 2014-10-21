package Model;

import View.GameObjectView;

/**
 * Created by vadim on 10/8/14.
 */
public abstract class GameObjectModel implements OnCollisionWith {

    protected GameObjectView view;

    public void destroy() {
        view.destroy();
    }

    public double[] getPosition() {

        return view.getPosition();
    }

    public void setPosition(double[] position) {
        view.setPosition(position);
    }

    public double[] getSpead() {

        return view.getSpead();
    }

    public void setSpead(double[] spead) {
        view.setSpead(spead);

    }


}
