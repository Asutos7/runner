import javafx.scene.image.ImageView;

public class heroes extends AnimatedThing{
    private ImageView image;
    private double x=0;//ici x représente le nombre de pixel du désert
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
        if (x<801){
            if(ind<500){
                x=x+1;
                if(x%10==0){
                    ind=ind+85;
                    this.setIndex(ind);
                }
                else{
                    this.setIndex(ind);
                }
            }
            else{
                ind=0;
                x=x+1;
                this.setIndex(ind);
            }
        }
        else{
            x=0;
        }
     }

    public double getX() {
        return x;
    }
}
