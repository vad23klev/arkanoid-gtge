package Model;

import Game.Arkanoid;
import Physics.Position;
import Physics.Speed;
import View.RacketView;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Класс для описания модели ракетки.
 * Created by vadim on 10/8/14.
 */
public class Racket  extends GameObjectModel {

    /**
     * Конструктор.
     * @param position - позиция ракетки в начальный момент времени.
     */
    public Racket(Position position) {
        this.view = new RacketView(this, position);
        Arkanoid.playfield.addGroup(this.getSprites());
        Arkanoid.keylistener.add(this);
    }

    @Override
    public void keyUp(int code) {
        switch (code) {
            case KeyEvent.VK_RIGHT:
                if (this.getSpeed().Horizontal > 0 && Arkanoid.start) {
                    this.setSpeed(new Speed(0, 0));
                } break;
            case KeyEvent.VK_LEFT:
                if (this.getSpeed().Horizontal < 0 && Arkanoid.start) {
                    this.setSpeed(new Speed(0, 0));
                } break;
        }
    }

    @Override
    public void keyDown(int code) {
        switch (code) {
            case KeyEvent.VK_RIGHT:
                if (this.getSpeed().Horizontal >= 0 && Arkanoid.start) {
                    this.setSpeed(new Speed(0.3, 0));
                } break;
            case KeyEvent.VK_LEFT:
                if (this.getSpeed().Horizontal <= 0 && Arkanoid.start) {
                    this.setSpeed(new Speed(-0.3, 0));
                } break;
        }
    }
}
