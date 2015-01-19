package Model;

import Control.CollisionControl.GameCollisionBounds;
import Game.Arkanoid;
import Physics.Direction;
import Physics.Position;
import Physics.Speed;
import View.BallView;
import com.golden.gamedev.object.background.ColorBackground;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Класс для описания модели шара.
 * Created by vadim on 10/8/14.
 */
public class Ball extends GameObjectModel{

    private boolean launched = false;

    /**
     * Конструктор.
     * @param position - позиция шара в начальный момент времени.
     */
    public Ball(Position position, Speed speed) {
        this.view = new BallView(this, position, speed);
        Arkanoid.playfield.addGroup(this.getSprites());
        Arkanoid.keylistener.add(this);
    }

    @Override
    public void keyDown(int code) {
        switch (code) {
            case KeyEvent.VK_SPACE:
                if (!this.launched) {
                    this.setSpeed(new Speed(0, -0.3));
                    this.launched = true;
                } break;
        }
    }
}
