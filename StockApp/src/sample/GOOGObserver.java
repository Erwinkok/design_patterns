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
public class GOOGObserver implements Observer {
    
    private double googPrice;
    
    private String observerName = "GOOGObserver";
    
    private Subject stockGrabber;
    
    public GOOGObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        stockGrabber.registerObserver(this);
        
        System.out.println("New Observer: " + this.observerName);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.googPrice = googPrice;
        printThePrice();
    }
    
    public void printThePrice(){
        System.out.println("GOOG: " + googPrice);
    }
    
    
    
    
    
}
