package pizza;


// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {
String size;
    public Mozzarella(Pizza newPizza) {
        
        super(newPizza);
        this.size = getSize();
        System.out.println("Adding Mozzarella");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost(){
    	double price;
    	if(size.equals("S"))
    	{
    		price = .50;
    		System.out.println("Cost of mozzarella: " + price);
    	} else if (size.equals("M")){
    		price = .80;
    		System.out.println("Cost of mozzarella: " + price);
    	}
    	else if (size.equals("L")){
    		price = 1.00;
    		System.out.println("Cost of mozzarella: " + price);
    	}
    	else{
    		price = 0;
    		System.out.println("Cost of mozzarella: " + price);
    	}
        return tempPizza.getCost() + price;
    }

	public String getSize() {
		return tempPizza.getSize();
	}

	@Override
	public void setSize(String size) {
		
	}

}
