package pizza;
// the CLient
public class PizzaMaker {
    
    public static void main(String[] args){
        // create a basic pizza with mozzarella & tomatosauce
    	String size = "M";
    	Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza(size)));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Size: " + basicPizza.getSize());
        System.out.println("Price: " + basicPizza.getCost());
        
        
    }
    
}