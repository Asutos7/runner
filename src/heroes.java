import javafx.scene.image.ImageView;

public class heroes extends AnimatedThing{
    //ici x représente le nombre de pixel du désert qui est de 800
    private double x=0;

    public heroes (double x, double y, double width, double height, double index, double altitude){
        super(x,y,width,height, index, altitude,"\\image\\heros.png");
    }

     public ImageView getImage(){
        return super.getImage1();
     }

     void update(){
        GameScene.setHero();

        //index sert à choisir la bonne image du héros sur le sprite
        double ind=this.getIndex();

        //sauter permet de savoir le héro se trouve à quelle position
         // sauter=0 -> le héros ne saute pas, il court simplement
         // sauter=1 -> la phase montante de son saut
         // sauter=2 -> la phase descendante de son saut
        double sauter=this.sauter;


        if(sauter==1){
            if(x<801){
                x=x+1;

                //Image du héros dans sa phase montante
                this.setIndex(0);
                this.setY(160);

                //La hauteur max est à 50
                //La boucle continue tant que la hauteur n'est pas atteinte
                if(this.getAltitude()>50){

                    //Pour tous les deux pixels parcourus
                    if(x%2==0){
                        System.out.println(getAltitude());

                        //Le héro monte de 5 pixel
                        this.setAltitude(this.getAltitude()-5);
                    }
                }
                else{

                    //Dès que la hauteur max est atteinte, on passe à la phase descendante
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

                //Image descendante du héros
                this.setIndex(90);

                //Phase descendante
                if(this.getAltitude()<250){
                    if(x%2==0){
                        System.out.println(getAltitude());

                        //Le héros descend de 5 pixels à chaque fois
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

            //Position initiale de l'altitude
            //Le héros court à cette hauteur
            this.setAltitude(250);
            if (x<801){
                if(ind<500){
                    x=x+1;

                    //tous les 10 pixels du désert parcourus, l'image du héros est changée
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
