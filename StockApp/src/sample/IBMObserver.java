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
public class IBMObserver implements Observer {
    
    private double ibmPrice;
    
    private String observerName = "IBMObserver";
    
    private Subject stockGrabber;

    public IBMObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        stockGrabber.registerObserver(this);
        
        System.out.println("New Observer: " + this.observerName);
    }
    
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        System.out.println("IBM: " + ibmPrice);
//        printThePrice();
    }
    
    public void printThePrice() {
        System.out.println("IBM: " + ibmPrice);
    }
    
    
    
}
