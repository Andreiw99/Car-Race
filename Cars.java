
public class Car {
	    private String name;
	    private int speed;

	    public Car(String name) {
	        this.name = name;
	    }

	   
	    public String getName() {
	        return name;
	    }
	    public void setName(String name)
	    {
	    	this.name = name;
	    }
	    public int getSpeed() {
	        return speed;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public void accelerate() {
	        speed ++;
	    }

	    public void brake () {
	        speed --;
	    }
}
