/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author ErwinKok
 */
public class AAPLObserver implements Observer {
    
    private double aaplPrice;
    
    private String observerName = "AAPLObserver";
    
    private Subject stockGrabber;
    
    public AAPLObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        stockGrabber.registerObserver(this);
        
        System.out.println("New Observer: " + this.observerName);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        printThePrice();
    }
    
    public void printThePrice() {
        System.out.println("AAPL: " + aaplPrice);
    }
    
    
    
    
}
