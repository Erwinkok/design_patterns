/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_exchange_excersice_1.pkg2;

/**
 *
 * @author ErwinKok
 */
public interface Subject {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    
}
