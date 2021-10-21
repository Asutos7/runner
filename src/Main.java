// add any usefull package line

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class Main extends Application{
@Override
    public void start(Stage primaryStage){

        // load the image
        Image image = new Image("C:\\Users\\Asutos\\IdeaProjects\\runner\\image\\desert.png");

        // simple displays ImageView the image as is

        ImageView iv1 = new ImageView();
        iv1.setImage(image);


        primaryStage.setTitle("Demo");
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);

        HBox box = new HBox();
        box.getChildren().add(iv1);
        root.getChildren().add(box);

        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
        // write your code here
    }
}

// utiliser gimp
//root.getChildren().add(desert.getSprite(());