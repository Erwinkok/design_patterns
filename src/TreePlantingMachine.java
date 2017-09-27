
public class TreePlantingMachine {
	public Tree getTree(String treeType) {
		if(treeType == null) {
			return null;
		}
		if(treeType.equalsIgnoreCase("OAK"))
		{
			return new Oak();
		} else if (treeType.equalsIgnoreCase("BIRCH"))
		{
			return new Birch();
		}
		return null;
	}
}
