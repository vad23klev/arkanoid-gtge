package View;

import Game.Arkanoid;
import Model.GameObjectModel;
import Physics.*;
import com.golden.gamedev.object.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Класс для описания представления шара.
 * Created by vadim on 10/8/14.
 */
public class BallView extends GameObjectView {

    public BallView(GameObjectModel model, Position position, Speed speed) {
        super(model, new SpriteGroup("Ball_" + Arkanoid.globalid));
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("img/ball.png"));
        } catch (IOException e) {}
        Sprite sprite = new Sprite(image);
        sprite.setID(Arkanoid.globalid);
        this.sprites.add(sprite);
        this.setPosition(position);
        this.setSpeed(speed);
        Arkanoid.globalid++;
    }
}
