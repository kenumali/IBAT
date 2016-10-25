public class SmarterRobot extends SmartRobot {	
	public void putNumOfBeepers(int num){
		int i = 0;
		while(i < num) {
			if(this.hasBeeper()) {
				this.putBeeper();
			}
			i++;
		}
	}
	
	public void pickUpNumOfBeepers(int num){
		int i = 0;
		while(i < num) {
			if(this.beeperPresent()) {
				this.pickBeeper();
			}
			i++;
		}
	}
	
	public void moveNumOfTimes(int num) {
		int i = 0;
		while(i < num) {
			if(this.frontIsClear()) {
				this.move();
			}
			i++;
		}
	}
}