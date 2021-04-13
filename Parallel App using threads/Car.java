
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
	    	Circuit circuit = new Circuit();
	    	int circuitLenght = 100;
	    	circuit.setLenght(circuitLenght);
	    	int previousSpeed = 0;
	    	
	    	while (Race.gameOver == 0)
	    	{
	    		this.accelerate();
	    		circuit.setLenght(circuitLenght - (this.getCurrentSpeed() + previousSpeed)); 
	    		previousSpeed = this.getCurrentSpeed();
	    		circuitLenght = circuitLenght - (this.getCurrentSpeed() + previousSpeed);
	    		if(circuit.getLenght() <= 0)
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
