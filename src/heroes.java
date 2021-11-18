import javafx.scene.image.ImageView;

public class heroes extends AnimatedThing{
    private ImageView image;
    private double x=0;//ici x représente le nombre de pixel du désert
    private heroes Hero;
    public heroes (double x, double y,double width, double height, double index,double altitude){
        super(x,y,width,height, index, altitude,"\\image\\heros.png");
    }

     public ImageView getImage(){
        return super.getImage1();
     }

     void update(){
        GameScene.Hero();
        double ind=this.getIndex();
         double sauter=this.sauter;


        if(sauter==1){
            if(x<801){
                x=x+1;
                this.setIndex(0);
                this.setY(160);
                if(this.getAltitude()>100){
                    if(x%2==0){
                        System.out.println(getAltitude());
                        this.setAltitude(this.getAltitude()-5);
                    }
                }
                else{
                    this.setSauter(2);
                }
            }
            else{
                x=0;
            }
        }
        if(sauter==2){
            if(x<801){
                x=x+1;
                this.setIndex(90);
                if(this.getAltitude()<250){
                    if(x%2==0){
                        System.out.println(getAltitude());
                        this.setAltitude(this.getAltitude()+5);
                    }
                }
                else{
                    this.setSauter(0);
                    this.setY(0);
                }
            }
            else{
                x=0;
            }
        }
        if(sauter==0){
            this.setAltitude(250);
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
     }



    public double getX() {
        return x;
    }

    void jump(){
        this.setSauter(1);
    }

}
