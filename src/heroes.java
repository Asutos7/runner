import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.geom.Rectangle2D;

public class heroes {
    // load the image

    Image spriteSheet = new Image("C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heroes.png");
    sprite = new ImageView(spriteSheet);
    sprite.setViewport(new Rectangle2D(20,0,65,100));
    sprite.setX(200);
    sprite.setY(300);

}
