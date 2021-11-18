import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Vilain {
    private ImageView image;
    private double x;
    private double y;
    private double width;
    private double height;
    private static double choix;
    private ImageView image1= new ImageView();

    public Vilain(double x,double y, double width, double height, String filename){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        Image image = new Image(filename);
        image1.setImage(image);
        image1.setViewport(new Rectangle2D(x,y,width,height));
    }

    void update(){
        if(Math.random()==1){
            choix=1;
        }
        else{
            choix=2;
        }
    }

    public static double getChoix(){
        return  choix;
    }

    public ImageView getImage(){
        return image1;
    }
}
