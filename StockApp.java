/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_exchange_excersice_1.pkg2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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
        
        launch(args);
        
        StockGrabber stockGrabber = new StockGrabber();
        
        IBMObserver ibmObserver = new IBMObserver(stockGrabber);
        AAPLObserver aaplObserver = new AAPLObserver(stockGrabber);
        GOOGObserver googObserver = new GOOGObserver(stockGrabber);
        
        stockGrabber.setIBMPrice(178.00);
        stockGrabber.setAAPLPrice(164.00);
        stockGrabber.setGOOGPrice(450.98);
        
        
        System.out.println("Hello World!");
        
        
        
    }
    
}
