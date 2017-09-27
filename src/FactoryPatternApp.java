
public class FactoryPatternApp {

	public static void main(String[] args) {
		TreePlantingMachine treeMachine = new TreePlantingMachine();
		
		Tree tree1 = treeMachine.getTree("OAK");
		tree1.grow();
		
		Tree tree2 = treeMachine.getTree("BIRCH");
		tree2.grow();
		
	}

}
