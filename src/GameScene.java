import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {
    private static heroes Hero= new heroes(200,0,65,100,20);
    private static staticThing left = new staticThing(0,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");
    private static staticThing right = new staticThing(400,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");

    public GameScene(Group parent, double height, double width) {
        super(parent,height,width);

        // Scène du désert

        ImageView left1= left.getImage1();
        //left1.setX(0);
        //left1.setY(0);

        ImageView right1= right.getImage1();
        //right1.setX( 400-Hero.getX()%800);
        //right1.setY(0);

        //Hero
        ImageView hero1=Hero.getImage();
        hero1.setX(200);
        hero1.setY(250);

        //Camera qui reprend les coordonnées du héro
        Camera cam = new Camera(0,0);

        timer.start();
        parent.getChildren().add(left1);
        parent.getChildren().add(right1);
        //Hero.getImage().setViewport(new Rectangle2D(Hero.getIndex(),0,75,100));
        parent.getChildren().add(Hero.getImage());

    }

    public static void Hero(){
        Hero.getImage().setViewport(new Rectangle2D(Hero.getIndex(),0,75,100));
    }

    public static void setLeft() {
        left.getImage1().setViewport(new Rectangle2D(Hero.getX()%800,0,800,400));
    }

    public static void setRight() {
        right.getImage1().setViewport(new Rectangle2D(400- Hero.getX(),0,800,400));
    }



    AnimationTimer timer = new AnimationTimer() {
        //@Override
        public void handle(long time){
            Hero.update();
            left.update();
            Camera.update();
            //GameScene.update(timer);
        }
    };

}
