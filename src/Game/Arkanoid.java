package Game;

import Control.CollisionManager;
import Model.*;
import Physics.Position;
import Physics.Speed;
import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.object.PlayField;
import com.golden.gamedev.object.SpriteGroup;
import com.golden.gamedev.object.background.ColorBackground;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by nikita on 17.01.15.
 */
public class Arkanoid extends Game {

    public static GameLoader game;

    public static PlayField playfield;

    public static ArrayList<GameObjectModel> keylistener;

    public static Board board;

    public static Mediator mediator;

    public static CollisionManager collisionManager;

    public static int globalid = 0;

    public static final int width = 960;

    public static final int height = 640;

    public static final boolean fullscreenmod = false;

    public static SpriteGroup racketGroup;

    public static SpriteGroup ballGroup;

    public static void main(String[] args) {
        game = new GameLoader();
        game.setup(new Arkanoid(), new Dimension(Arkanoid.width, Arkanoid.height), Arkanoid.fullscreenmod);
        game.start();
    }

    @Override
    public void initResources() {
        Arkanoid.playfield = new PlayField(new ColorBackground(Color.white, width, height));
        Arkanoid.keylistener = new ArrayList<GameObjectModel>();
        Arkanoid.board = new Board(new Position(0, 0));
        Arkanoid.mediator = new Mediator();
        Arkanoid.racketGroup = Arkanoid.playfield.addGroup(new SpriteGroup("racket"));
        Arkanoid.ballGroup = Arkanoid.playfield.addGroup(new SpriteGroup("ball"));
        ArrayList<GameObjectModel> arrayList = Arkanoid.board.models();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getClass() == Ball.class) {
                arrayList.get(i).view().addStritesToGroup(Arkanoid.ballGroup);
            } else if (arrayList.get(i).getClass() == Racket.class) {
                arrayList.get(i).view().addStritesToGroup(Arkanoid.racketGroup);
            }
        }
        Arkanoid.collisionManager = new CollisionManager(this);



    }

    @Override
    public void update(long l) {
        Arkanoid.playfield.update(l);

        if (keyDown(KeyEvent.VK_LEFT)) {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyDown(KeyEvent.VK_LEFT);
            }
        }
        else {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyUp(KeyEvent.VK_LEFT);
            }
        }
        if (keyDown(KeyEvent.VK_RIGHT)) {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyDown(KeyEvent.VK_RIGHT);
            }
        }
        else {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyUp(KeyEvent.VK_RIGHT);
            }
        }
        if (keyDown(KeyEvent.VK_SPACE)) {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyDown(KeyEvent.VK_SPACE);
            }
        }
        else {
            for (int i = 0; i < Arkanoid.keylistener.size(); i++) {
                Arkanoid.keylistener.get(i).keyUp(KeyEvent.VK_SPACE);
            }
        }
    }

    @Override
    public void render(Graphics2D graphics2D) {
        Arkanoid.playfield.render(graphics2D);
    }
}
