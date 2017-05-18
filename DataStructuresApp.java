import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DataStructuresApp extends Application {

    private Structures model;
    private ArrayView view;

    public void start(Stage mainWindow){
        model = new Structures();
        view = new ArrayView(model);
        mainWindow.setTitle("Data Structures");
        mainWindow.setScene(new Scene(view, 300, 500));
        mainWindow.show();
    }

    public static void main(String[]args){ launch(args); }
}
