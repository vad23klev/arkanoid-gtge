package Control;

import Control.CollisionControl.GameAdvanceCollisionGroup;
import Control.CollisionControl.GameAdvanceCollisionGroupBall;
import Control.CollisionControl.GameCollisionBounds;
import Game.Arkanoid;
import Model.Mediator;
import com.golden.gamedev.object.SpriteGroup;
import com.golden.gamedev.object.background.ColorBackground;

import java.awt.*;

/**
 * Класс для обнаружения коллизий.
 * Created by vadim on 10/8/14.
 */
public class CollisionManager {

    /* Связь обработчика коллизий и модели*/
    protected Mediator mediator= null;

    /**
     * Проверка на коллизии.
     */
    public void check_collision() {

    }
    /**
     * Конструктор.
     */
    public CollisionManager(Arkanoid game) {
        this.mediator = game.mediator;
        GameAdvanceCollisionGroup advance = new GameAdvanceCollisionGroup();
        Arkanoid.playfield.addCollisionGroup(Arkanoid.ballGroup, Arkanoid.racketGroup, advance);
        advance = new GameAdvanceCollisionGroupBall();
        Arkanoid.playfield.addCollisionGroup(Arkanoid.ballGroup, Arkanoid.ballGroup, advance);
    }
}
