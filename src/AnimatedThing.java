import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing {
    protected double sauter;
    private double x;
    private double y;
    private ImageView image1;
    private double altitude;
    private double index;
    private double max_index;
    //duration between two frames
    private double duration;
    // dimension of the window
    private double height;
    private double width;
    // the offset between each frame
    private double offset;

    public AnimatedThing(double x, double y, double width, double height,double index, double altitude,String filename){
        this.x=x;
        this.y=y;
        this.index = index;
        this.width=width;
        this.height=height;
        this.altitude=altitude;
        this.image1 = new ImageView(new Image(filename));
        this.image1.setViewport(new Rectangle2D(index,y,width,height));
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double getIndex() {
        return index;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public ImageView getImage1(){
        return image1;
    }


    public void setIndex(double index) {
        this.index = index;
    }

    public void setAltitude(double altitude){this.altitude=altitude;}

    public double getAltitude() {
        return altitude;
    }

    public void setY(double y){
        this.y=y;
    }

    public void setSauter(double sauter){
        this.sauter=sauter;
    }

}
