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
        primaryStage.setTitle("Runner");
        Group root = new Group();
        GameScene scene = new GameScene(root, 600, 400);
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