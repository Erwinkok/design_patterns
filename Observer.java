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
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
