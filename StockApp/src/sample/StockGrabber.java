/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;

/**
 *
 * @author ErwinKok
 */
public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    
    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println(o.toString());
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(ibmPrice, aaplPrice, googPrice);
        }
    }
    
    public void setIBMPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }    
    
    public void setAAPLPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }
    
    public void setGOOGPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }
    
    
}
