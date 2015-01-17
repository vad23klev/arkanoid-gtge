package View;

import Game.Arkanoid;
import Model.GameObjectModel;
import Physics.Position;
import Physics.Speed;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.SpriteGroup;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Класс для описания представления ракетки.
 * Created by vadim on 10/8/14.
 */
public class RacketView extends GameObjectView {

    public RacketView(GameObjectModel model, Position position) {
        super(model, new SpriteGroup("Racket_" + Arkanoid.globalid));
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("img/racket.png"));
        } catch (IOException e) {}
        Sprite sprite = new Sprite(image);
        sprite.setID(Arkanoid.globalid);
        this.sprites.add(sprite);
        this.setPosition(position);
        this.setSpeed(new Speed(0, 0));
        Arkanoid.globalid++;
    }
}
