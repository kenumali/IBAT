public class SmartWorld extends World {
	
	//call the constructor of the World class
	public SmartWorld () {
		super();
	}
	
	//overrides the default size of the maze..
	public SmartWorld(int x, int y) {
		super(x, y);
	}
	
	//This method adds a specific number of beepers passed through the parameter.
	public void addNumOfBeepers (int x, int y, int num){
		//loops until the number of beepers has been set
		int i = 0;
		while(i < num) {
			this.addBeeper(x, y);
			i++;
		}
	}
}