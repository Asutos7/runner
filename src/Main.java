import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;



public class Main extends Application{
@Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Runner");
        Group root = new Group();
        GameScene scene = new GameScene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

// utiliser gimp
//root.getChildren().add(desert.getSprite(());