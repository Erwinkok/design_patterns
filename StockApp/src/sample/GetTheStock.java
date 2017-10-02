/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
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
    private UpdateTheStock updateTheStock;
    
    
    public GetTheStock(StockGrabber stockGrabber, String stockName, double price){
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.price = price;

        updateTheStock = new UpdateTheStock(this.stockGrabber, this.stockName, this.price);


        
    }

   
    @Override
    public void run() { 
        scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this.updateTheStock, 0, 2, TimeUnit.SECONDS);
        
    }
    



    
}
