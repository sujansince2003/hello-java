import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    public void start(Stage stage) {
        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(new Button("One"), new Button("Two"), new Button("Three"));

        Scene scene = new Scene(pane, 300, 200);
        stage.setTitle("FlowPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
