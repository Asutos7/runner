import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {

    public GameScene(Group parent, double height, double width) {
        super(parent,height,width);
        // charger le désert
        //Image image = new Image("C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");

        // Scène du désert

        //ImageView iv1 = new ImageView(image);
        //iv1.setImage(image);
        staticThing left = new staticThing(0,0,800,300,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");
        ImageView left1= left.getImage1();
        left1.setX(0);
        left1.setY(0);

        staticThing right = new staticThing(300,0,800,300,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");
        ImageView right1= right.getImage1();
        right1.setX(300);
        right1.setY(0);
        //Hero

        heroes Hero = new heroes(435,0);
        ImageView hero1=Hero.getSprite();
        hero1.setX(200);
        hero1.setY(250);

        //Camera qui reprend les coordonnées du héro
        Camera cam = new Camera(0,0);

        parent.getChildren().add(left1);
        parent.getChildren().add(right1);
        parent.getChildren().add(hero1);
    }

}
