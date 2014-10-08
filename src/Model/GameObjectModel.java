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

    public float[] getPosition() {

        return view.getPosition();
    }

    public void setPosition(float[] position) {
        view.setPosition(position);
    }

    public float[] getSpead() {

        return view.getSpead();
    }

    public void setSpead(float[] spead) {
        view.setSpead(spead);

    }


}
