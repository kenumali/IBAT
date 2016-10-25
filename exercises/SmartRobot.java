public class SmartRobot extends Robot
{ 
	   public SmartRobot()
	   {
	           // inside the SmartRobot() constructor so going to call the constructor of the 
		       // super class ie Robot() 
		       super();		
	   }

	   public SmartRobot(String colour)
	   {		
	           // inside the SmartRobot(String colour) constructor so going to call the constructor of the 
		       // super class ie Robot(String colour)
		       super(colour);		
	   }
//###################################################################################################################
	   public void moveTwoTimes()
	   {			
                // write code between the dashed lines to make the robot move two times. 
		//-----------------------------------------------------------------------------------------------
               this.move();
		       this.move();
		//-----------------------------------------------------------------------------------------------	
	   }
//###################################################################################################################
	   public void moveFourTimes()
	   {			
                // write code between the dashed lines to make the robot move four times. 
                //-----------------------------------------------------------------------------------------------
	            this.move();
		        this.move();
		        this.move();
		        this.move();
		    
		       /* 
		       or i could have replace the code above with these lines
			
		       this.moveTwoTimes();
		       this.moveTwoTimes();
		       */
	        //-----------------------------------------------------------------------------------------------			
	   }
//###################################################################################################################	   
	   public void moveEightTimes()
	   {	
                // write code between the dashed lines to make the robot move eight times. 
	        //-----------------------------------------------------------------------------------------------
		       this.move();
		       this.move();
		       this.move();
		       this.move();
		       this.move();
		       this.move();
		       this.move();
		       this.move();
            
	               /*
		        or i could have replace the code above with these lines
			
		       this.moveFourTimes();
		       this.moveFourTimes();
            
	            or another way of doing it would be 
                int i = 0;
		        while ( i < 8 )
		        {
		    	   this.move();
			       i = i + 1;
	            }
		       */
                 //-----------------------------------------------------------------------------------------------
	   }
	   
	   //Make the robot to move according to the number of times passed in the paramater
	   
	   
//###################################################################################################################
	   public void turnAround()
           { 
		 // write code between the dashed lines to make the robot turn 180 degrees.
		 //-----------------------------------------------------------------------------------------------
	            this.turnLeft(); 
		        this.turnLeft();
                 //-----------------------------------------------------------------------------------------------
           }	
//###################################################################################################################   
	   public void turnRight()
	   {     
		       // write code between the dashed lines to make the robot turn right.
	           //-----------------------------------------------------------------------------------------------
                this.turnLeft();
                this.turnLeft();
		        this.turnLeft();
                //-----------------------------------------------------------------------------------------------
	   }
//###################################################################################################################
           public void turnNorth()
           {
	         // write code between the dashed lines to make the robot turn north.
	         //-----------------------------------------------------------------------------------------------
		       while (!this.facingNorth())
		       {
			         this.turnLeft();
		       }
	         //-----------------------------------------------------------------------------------------------
           }
//###################################################################################################################
           public void turnSouth()
           {
	         // write code between the dashed lines to make the robot turn south.
	         //-----------------------------------------------------------------------------------------------
                while (!this.facingSouth())
	            {
		             this.turnLeft();
	            }
	         //-----------------------------------------------------------------------------------------------
           }
//###################################################################################################################
           public void turnEast()
           {
	         // write code between the dashed lines to make the robot turn east.
	         //-----------------------------------------------------------------------------------------------
                while (!this.facingEast())
	            {
		            this.turnLeft();
	            }
	         //-----------------------------------------------------------------------------------------------
           }
//###################################################################################################################
           public void turnWest()
	   { 
	         // write code between the dashed lines to make the robot turn west.
	         //-----------------------------------------------------------------------------------------------
                while (!this.facingWest())
	            {
	    	          this.turnLeft();
	            }
	         //-----------------------------------------------------------------------------------------------
           }
//###################################################################################################################
           public void pickUpAllBeepers()
           {
	         // write code between the dashed lines to make the robot pick up all the beepers in the cell 
		 // it is currently in and not cause an error.
		 //-----------------------------------------------------------------------------------------------
	            while ( this.beeperPresent() )
		        { 
		             this.pickBeeper(); 
		        } 
                 //-----------------------------------------------------------------------------------------------   
           }
//###################################################################################################################
           public void putAllBeepers()
           {
                 // write code between the dashed lines to make the robot place all the beepers it has in the cell
		 // it is currently in and not cause an error.
		 //-----------------------------------------------------------------------------------------------
                while ( this.hasBeeper() ) 
		        { 
		             this.putBeeper(); 
		        }  
		 //-----------------------------------------------------------------------------------------------
           } 
//###################################################################################################################
           public boolean rightIsClear()
           { 		
	            boolean right_clear = false;

	         // write code between the dashed lines to return true if the right is clear and return false
	         // if the right is not clear, the robot should still be facing the same direction after this method.
	         //-----------------------------------------------------------------------------------------------             	    
	      	    this.turnRight(); 
		        if ( this.frontIsClear() )
		        { 
		             right_clear = true; 
		        }
                this.turnLeft(); 	    
		 //-----------------------------------------------------------------------------------------------
		        return right_clear;
           }
//###################################################################################################################
           public boolean leftIsClear()
           {
	            boolean left_clear  = false;

                // write code between the dashed lines to return true if the left is clear and return false
	            // if the left is not clear, the robot should still be facing the same direction after this method.
	         //-----------------------------------------------------------------------------------------------                        
	            this.turnLeft(); 
                if ( this.frontIsClear() ) 
	            { 
		             left_clear = true; 
	            }
                this.turnRight(); 
	         //-----------------------------------------------------------------------------------------------
		        return left_clear;
           }
//###################################################################################################################
           public boolean backIsClear()
           {
	         boolean back_clear  = false;	

	         // write code between the dashed lines to return true if the back is clear and return false
	         // if the back is not clear, the robot should still be facing the same direction after this method.
	         //-----------------------------------------------------------------------------------------------                       		
	            this.turnAround(); 
	            if ( this.frontIsClear() ) 
	            { 
		            back_clear = true; 
	            }
                this.turnAround(); 	                
	         //-----------------------------------------------------------------------------------------------
                return back_clear;
           }
//###################################################################################################################		
}