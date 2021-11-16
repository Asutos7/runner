import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {

    private static heroes Hero= new heroes(20,0,65,100,0,250);
    private static staticThing heart = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heart.png");
    private static staticThing heart2 = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heart.png");
    private static staticThing heart3 = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heart.png");
    //J'ai eu l'accord pour pouvoir utiliser sa photo
    private static staticThing Marine1 = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\Marine.png");
    private static staticThing Marine2 = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\Marine.png");
    private static staticThing Marine3 = new staticThing(0,0,50,50,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\Marine.png");
    private static staticThing left = new staticThing(0,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");
    private static staticThing right = new staticThing(400,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");
    //private static staticThing left = new staticThing(0,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert2.jpg");
    //private static staticThing right = new staticThing(400,0,800,400,"C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert2.jpg");
    private double x=0;
    private static double sauter=0;
    private double altitude;

    public GameScene(Group parent, double height, double width) {
        super(parent,height,width);



        //Hero
        /*ImageView hero1=Hero.getImage();
        Hero.getImage().setX(200);
        Hero.getImage().setY(altitude);*/


        //Camera qui reprend les coordonnées du héro
        Camera cam = new Camera(0,0);

        //Vie1
        heart.getImage1().setX(720);
        heart.getImage1().setY(40);

        //Vie2
        heart2.getImage1().setX(680);
        heart2.getImage1().setY(40);

        //Vie 3
        heart3.getImage1().setX(640);
        heart3.getImage1().setY(40);

        //Marine1
        Marine1.getImage1().setX(720);
        Marine1.getImage1().setY(40);

        //Marine2
        Marine2.getImage1().setX(660);
        Marine2.getImage1().setY(40);

        //Marine3
        Marine3.getImage1().setX(600);
        Marine3.getImage1().setY(40);

        timer.start();
        parent.getChildren().add(left.getImage1());
        parent.getChildren().add(right.getImage1());
        parent.getChildren().add(Hero.getImage());
        parent.getChildren().add(heart.getImage1());
        parent.getChildren().add(heart2.getImage1());
        parent.getChildren().add(heart3.getImage1());
        /*parent.getChildren().add(Marine1.getImage1());
        parent.getChildren().add(Marine2.getImage1());
        parent.getChildren().add(Marine3.getImage1());*/

        //saut
        this.setOnMouseClicked((event)->{
            System.out.println("Jump");
            Hero.jump();
        });

    }

    public static void Hero(){
        double altitude = Hero.getAltitude();
        Hero.getImage().setViewport(new Rectangle2D(Hero.getIndex(), Hero.getY(), 85,100));
        Hero.getImage().setX(200);
        Hero.getImage().setY(altitude);
    }

    public static void setLeft() {
        ImageView left1= left.getImage1();
        left.getImage1().setViewport(new Rectangle2D(Hero.getX()%800,0,800,400));
        left1.setX(0);
        left1.setY(0);
    }

    public static void setRight() {
        ImageView right1= right.getImage1();
        right.getImage1().setViewport(new Rectangle2D(0,0, Hero.getX()%800,400));
        right1.setX(800-(Hero.getX()%800));
        right1.setY(0);

    }

    static void update(){
        setLeft();
        setRight();
    }

    AnimationTimer timer = new AnimationTimer() {
        //@Override
        public void handle(long time){
            Hero.update();
            Camera.update();
            GameScene.update();
        }
    };

}
