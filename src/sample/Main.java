package sample;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 800));

        primaryStage.setMinHeight(750);
        primaryStage.setMinWidth(750);

        root.scaleXProperty().bind(Bindings.min(primaryStage.widthProperty().divide(primaryStage.minWidthProperty()),
                primaryStage.heightProperty().divide(primaryStage.minHeightProperty())));

        root.scaleYProperty().bind(root.scaleXProperty());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
