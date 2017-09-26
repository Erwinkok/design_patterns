package pizza;
// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {
	String size;
    public TomatoSauce(Pizza newPizza) {

        super(newPizza);
        this.size = getSize();
        System.out.println("Adding sauce");
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost(){  
       	double price;
    	if(size.equals("S"))
    	{
    		price = .35;
    		System.out.println("Cost of sauce: " + price);
    	} else if (size.equals("M")){
    		price = .45;
    		System.out.println("Cost of sauce: " + price);
    	}
    	else if (size.equals("L")){
    		price = .55;
    		System.out.println("Cost of sauce: " + price);
    	}
    	else{
    		price = 0;
    		System.out.println("Cost of sauce: " + price);
    	}
        return tempPizza.getCost() + price;
    }

	@Override
	public String getSize() {
		return tempPizza.getSize();
	}
	@Override
	public void setSize(String size) {
		this.size = size;
	}
}