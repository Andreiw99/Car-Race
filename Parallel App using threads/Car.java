
public class Car extends Thread {
	    private String name;
	    private int currentSpeed;
	    private int topSpeed;
	    
	    public Car(String name, int topSpeed) {
	        this.name = name;
	        this.topSpeed = topSpeed;
	        
	    }

	   public String getCarName()
	   {
		   return name;
	   }
	  
	    public int getCurrentSpeed() {
	        return currentSpeed;
	    }
	    
	    public int getTopSpeed() {
	        return topSpeed;
	    }

	    public void setCurrentSpeed(int speed) {
	        this.currentSpeed = speed;
	    }
	    
	    public void setTopSpeed(int speed) {
	        this.topSpeed = speed;
	    }

	    public void accelerate() {
	    	if(this.currentSpeed < this.topSpeed)
	    		currentSpeed ++;
	    }
	    
	    
	    public void run()
	    {
	    	while (Race.gameOver == 0)
	    	{
	    		this.accelerate();
	    		Race.circuit = Race.circuit - this.getCurrentSpeed();
	    		if(Race.circuit < 0)
	    		{
	    			Race.gameOver = 1;
	    			System.out.println(this.getCarName() + " a cistigat ");	
	    		}
	    	}
	    	
	    }

	    public void brake () {
	    	currentSpeed --;
	    }
}
