package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ErwinKok
 */
public class StockApp extends Application {

    @Override
    public void start(Stage primaryStage) {



        StackPane root = new StackPane();
//        root.getChildren().add(btn);

        Scene scene = new Scene(root, 640, 480);

        primaryStage.setTitle("Private Wallstreet Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        launch(args);

        StockGrabber stockGrabber = new StockGrabber();

        IBMObserver ibmObserver = new IBMObserver(stockGrabber);
        AAPLObserver aaplObserver = new AAPLObserver(stockGrabber);
        GOOGObserver googObserver = new GOOGObserver(stockGrabber);



        GetTheStock IBMStock = new GetTheStock(stockGrabber, "IBM", 30.00);
        GetTheStock AAPLStock = new GetTheStock(stockGrabber, "AAPL", 60.00);
        GetTheStock GOOGStock = new GetTheStock(stockGrabber, "GOOG", 50.00);

        Thread thread1 = new Thread(IBMStock);
//        Thread thread2 = new Thread(AAPLStock);
//        Thread thread3 = new Thread(GOOGStock);


        thread1.start();
//        thread2.start();
//        thread3.start();
//





    }

}