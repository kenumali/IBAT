// Use the methods inside the SmarterRobot class instead of Robot class
// Use the methods inside the SmartWorld class instead of World class 

public class MyMaze
{
	public static void main(String [] args)
	{
		SmartWorld yard = new SmartWorld();
		
		yard.addWall(0, 14, 15, "east");
		yard.addWall(0, 12, 3, "east");
		yard.addWall(1, 0, 14, "east");
		yard.addWall(1, 1, 7, "east");
		yard.addWall(1, 2, 9, "north");
		yard.addWall(3, 3, 10, "north");
		yard.addWall(4, 3, 10, "north");
		yard.addWall(5, 3, 10, "north");
		yard.addWall(6, 3, 2, "north");
		yard.addWall(7, 3, 2, "north");
		yard.addWall(8, 7, 6, "north");
		yard.addWall(10, 1, 5, "east");
		yard.addWall(10, 3, 5, "east");
		yard.addWall(10, 5, 5, "east");
		yard.addWall(14, 6, 7, "north");
		yard.addBlock(0, 13);
		yard.addBlock(8, 13);
		yard.addBlock(14, 13);
		
		//addNumOfBeepers(x,y,number of beepers)
		yard.addNumOfBeepers(9, 6, 12);  
		yard.addNumOfBeepers(9, 9, 5);
		yard.addNumOfBeepers(9, 13, 4);
		yard.addNumOfBeepers(13, 6, 10);
		yard.addNumOfBeepers(13, 9, 13);
		yard.addNumOfBeepers(13, 13, 6);
		
		SmarterRobot ringo = new SmarterRobot();
		yard.add(ringo);

		ringo.turnNorth();
		ringo.moveNumOfTimes(11);
		ringo.turnEast();
		ringo.moveNumOfTimes(2);
		ringo.turnRight();
		ringo.moveNumOfTimes(9);
		ringo.turnEast();
		ringo.moveNumOfTimes(7);
		ringo.turnNorth();
		ringo.moveFourTimes();
		ringo.pickUpNumOfBeepers(12);
		ringo.moveNumOfTimes(3);
		ringo.pickUpNumOfBeepers(5);
		ringo.moveFourTimes();
		ringo.pickUpNumOfBeepers(4);
		ringo.turnEast();
		ringo.moveFourTimes();
		ringo.pickUpNumOfBeepers(6);
		ringo.turnSouth();
		ringo.moveFourTimes();
		ringo.pickUpNumOfBeepers(13);
		ringo.moveNumOfTimes(3);
		ringo.pickUpNumOfBeepers(10);
		ringo.turnWest();
		ringo.moveFourTimes();
		ringo.turnSouth();
		ringo.moveFourTimes();
		ringo.turnWest();
		ringo.moveNumOfTimes(7);
		ringo.turnNorth();
		ringo.moveNumOfTimes(10);
		ringo.turnWest();
		ringo.moveTwoTimes();
		ringo.putNumOfBeepers(20); //put down 20 beepers instead of 50
		ringo.turnSouth();
		ringo.moveNumOfTimes(11);
		}
}

/*

>javac MyMaze.java

>java MyMaze

If you don't have the robot.jar file added to the class path then compile and run as shown below

>javac -cp robot.jar;. MyMaze.java

>java -cp robot.jar;. MyMaze

*/