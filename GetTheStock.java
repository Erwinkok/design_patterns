/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_exchange_excersice_1.pkg2;

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
    private Subject stockGrabber;
    private ScheduledExecutorService scheduler;
    
    
    public GetTheStock(StockGrabber stockGrabber, String stockName, double price){
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.price = price;
        
       
        
    }

   
    @Override
    public void run() { 
        scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this, 0, 2, TimeUnit.SECONDS);
        
        
        
    }
    
    public double generateRandomPrice(double price){
        double randNum = (price * (.1)) - .05; 
        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.valueOf(df.format((price + randNum)));   
        
        return price;
    }
    
}
