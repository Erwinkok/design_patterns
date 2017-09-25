/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.text.DecimalFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ErwinKok
 */
public class GetTheStock implements Runnable {
    private String stockName;
    private double price;
    private StockGrabber stockGrabber;
    private ScheduledExecutorService scheduler;
    
    
    public GetTheStock(StockGrabber stockGrabber, String stockName, double price){
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.price = price;
        
        double newStockPrice = generateRandomPrice();
        this.updateStockPrice(newStockPrice);
        
    }

   
    @Override
    public void run() { 
        scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 2, TimeUnit.SECONDS);
        
    }
    
    public double generateRandomPrice(){
        double randNum = (Math.random() * (.1)) - .05;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format((this.price + randNum)));
    }

    public void updateStockPrice(double newStockPrice){
        switch(this.stockName){
            case "IBM":
                this.stockGrabber.setIBMPrice(newStockPrice);
                break;
            case "AAPL":
                this.stockGrabber.setAAPLPrice(newStockPrice);
                break;
            case "GOOG":
                this.stockGrabber.setGOOGPrice(newStockPrice);
                break;

        }
    }
    
}
