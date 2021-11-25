public class Vilain extends AnimatedThing{
    private double choix;
    private double x;
    private double y;
    private double distance=0;
    public Vilain(double x, double y,double width, double height, double index,double altitude){
        //J'ai eu son accord pour pouvoir utiliser sa photo
        super(x,y,width,height, index, altitude,"\\image\\Marine.png");
    }

    //J'ai tenté de le faire afficher de manière aléatoire mais je n'ai pas réussi
    // J'ai donc fait afficher de manière périodique
    // Voici la trace de mon travail en commentaire de ce que j'ai tenté
    void update(){
        /*if(x<801){
            x=x+1;
            if(x%10==0){
                System.out.println(x);
                y=Math.random();
                System.out.println(distance);
                if(y<0.5){
                    System.out.println(y);
                    if(distance<801){
                        distance=distance+1;
                        choix=1;
                    }
                    else{
                        distance=0;
                    }
                }
                else{
                    choix=2;
                }
            }
        }
        else{
            x=0;
        }*/
        /*y=Math.random();
        System.out.println(distance);
        if(y<0.5){
            System.out.println(y);
            if(distance<801){
                distance=distance+1;
                choix=1;
            }
            else{
                distance=0;
            }
        }
        else{
            choix=2;
        }*/
        if(distance<801){
            distance=distance+1;
            choix=1;
        }
        else{
            distance=0;
        }

    }

    public double getDistance() {
        return distance;
    }

    public double getChoix() {
        return choix;
    }
}
