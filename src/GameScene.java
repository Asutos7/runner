import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {

    //Chargement des images
    private static heroes Hero= new heroes(20,0,65,100,0,250);
    private static staticThing heart = new staticThing(0,0,50,50,"\\image\\heart.png");
    private static staticThing heart2 = new staticThing(0,0,50,50,"\\image\\heart.png");
    private static staticThing heart3 = new staticThing(0,0,50,50,"\\image\\heart.png");
    private static staticThing left = new staticThing(0,0,800,400,"\\image\\desert2.png");
    private static staticThing right = new staticThing(400,0,800,400,"\\image\\desert2.png");
    private static Vilain Foe = new Vilain(0,0,50,50,0,250);


    public GameScene(Group parent, double height, double width) {
        super(parent,height,width);

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

        timer.start();
        parent.getChildren().add(left.getImage1());
        parent.getChildren().add(right.getImage1());
        parent.getChildren().add(Foe.getImage1());
        parent.getChildren().add(Hero.getImage());
        parent.getChildren().add(heart.getImage1());
        parent.getChildren().add(heart2.getImage1());
        parent.getChildren().add(heart3.getImage1());

        //saut
        this.setOnMouseClicked((event)->{
            System.out.println("Jump");
            Hero.jump();
        });

    }

    //Gére l'affichage du héro
    public static void setHero(){
        double altitude = Hero.getAltitude();
        Hero.getImage().setViewport(new Rectangle2D(Hero.getIndex(), Hero.getY(), 85,100));
        Hero.getImage().setX(200);
        Hero.getImage().setY(altitude);
    }

    //Gére l'affichage de l'image pour la zone gauche
    //L'image est placée à la position (0,0)
    //A chaque fois on prend une zone de l'image puis on décale cette zone vers la droite
    public static void setLeft() {
        ImageView left1= left.getImage1();
        left.getImage1().setViewport(new Rectangle2D(Hero.getX()%800,0,800,400));
        left1.setX(0);
        left1.setY(0);
    }

    //Gére l'affichge de l'image pour la zone droite
    //On prend l'image en entier
    //Cette image est décalée vers la gauche au fil du temps
    public static void setRight() {
        ImageView right1= right.getImage1();
        right.getImage1().setViewport(new Rectangle2D(0,0, Hero.getX()%800,400));
        right1.setX(800-(Foe.getDistance()%800));
        right1.setY(0);

    }

    //Gére l'affichage de l'ennemi
    //L'affichage est très identique à celui de setRight
    public static void setFoe() {
        double choix=Foe.getChoix();
        if (choix==1){
            ImageView Foe1= Foe.getImage1();
            Foe.getImage1().setViewport(new Rectangle2D(0,0, Hero.getX()%800,400));
            Foe1.setX(800-(Hero.getX()%800));
            Foe1.setY(300);
        }
    }

    static void update(){
        setLeft();
        setRight();
        setFoe();
    }

    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time){
            Hero.update();
            Foe.update();
            Camera.update();
            GameScene.update();
        }
    };

}
