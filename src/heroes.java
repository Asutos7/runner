import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Rectangle2D;


public class heroes {
    private double x;
    private double y;

    Image spriteSheet = new Image("C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heros.png");
    ImageView sprite = new ImageView(spriteSheet);

    public heroes (double x, double y){
        this.x=x;
        this.y=y;
        sprite.setViewport(new Rectangle2D(x,y,65,100));
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
     public ImageView getSprite(){
        return sprite;
     }
    
}

/*

 */