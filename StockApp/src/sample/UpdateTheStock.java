package sample;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by ErwinKok on 26-09-17.
 */
public class UpdateTheStock implements Runnable {
    private StockGrabber stockGrabber;
    private String stockName;
    private double price;

    public UpdateTheStock(StockGrabber stockGrabber, String stockName, double price){
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.price = price;


        double newStockPrice = this.generateRandomPrice();
        this.updateStockPrice(newStockPrice);

    }

    @Override
    public void run() {

    }

    public double generateRandomPrice(){
        double randNum = Math.round((Math.random() * (.1)) - .05);
//
//        ThreadLocal<NumberFormat> numberFormat = new ThreadLocal<NumberFormat>() {
//            @Override
//            public NumberFormat initialValue() {
//
//                return new DecimalFormat("#.##");
//            }
//        };

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
//        newPrice = numberFormat1.parse(numberFormat.get().format(this.price + randNum));
        double p = this.price + randNum;

        double newPrice = numberFormat.format(p);


        return newPrice;
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
