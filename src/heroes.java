import javafx.scene.image.ImageView;

public class heroes extends AnimatedThing{
    private ImageView image;
    private double x;
    private heroes Hero;
    public heroes (double x, double y,double width, double height, double index){
        super(x,y,width,height, index, "C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\heros.png");
    }

     public ImageView getImage(){
        return super.getImage1();
     }

     void update(){
        GameScene.Hero();
        double ind=this.getIndex();
        if(ind<500){
            ind=ind+85;
            x=x+50;
            this.setIndex(ind);
        }
        else{
            ind=0;
            x=x+50;
            this.setIndex(ind);
        }
     }

    public double getX() {
        return x;
    }
}
