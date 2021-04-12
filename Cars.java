
public class Car {
	    private String name;
	    private int currentSpeed;
	    private int topSpeed;

	    public Car(String name, int topSpeed) {
	        this.name = name;
	        this.topSpeed = topSpeed;
	        
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
}
