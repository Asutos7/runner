import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class staticThing {
    private double x;
    private double y;
    private double height;
    private double width;
    private ImageView image1 = new ImageView();
    private static ImageView desert;
    String filename;

    public staticThing(double x, double y, double height, double width,  String filename){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
        Image image = new Image(filename);
        image1.setImage(image);
        image1.setViewport(new Rectangle2D(x,y,width,height));
    }

    public double getX(){
        return  x;
    }

    public double getY(){
        return y;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public ImageView getImage1(){
        return image1;
    }

    void update(){
        //GameScene.Hero();
        //GameScene.setLeft();
        //GameScene.setRight();
    }



}
