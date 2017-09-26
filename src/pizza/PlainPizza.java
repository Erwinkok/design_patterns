package pizza;
// a Concrete Component
public class PlainPizza implements Pizza {
	String size;
	
	public PlainPizza(String size){
		setSize(size);
	}
    public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {
    	double price;
    	if(size.equals("S"))
    	{
    		price = 4.00;
    		System.out.println("Cost of plain pizza: " + price);
    	} else if (size.equals("M")){
    		price = 5.00;
    		System.out.println("Cost of plain pizza: " + price);
    	}
    	else if (size.equals("L")){
    		price = 6.00;
    		System.out.println("Cost of plain pizza: " + price);
    	}
    	else{
    		price = 0;
    		System.out.println("Cost of plain pizza: " + price);
    	}
        
        return price;
    }

	@Override
	public String getSize() {
		return size;
	}

	@Override
	public void setSize(String size) {
		this.size = size;
	}
}