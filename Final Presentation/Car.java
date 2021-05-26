
public class Car extends Thread {
	    private String name;
	    private int currentSpeed;
	    private int topSpeed;
	    private static String winner;
	    
	    public Car(String name, int topSpeed) {
	        this.name = name;
	        this.topSpeed = topSpeed;
	        
	    }

	   public String getCarName()
	   {
		   return name;
	   }
	   
	   public static String getWinner()
	   {
		   return winner;
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
	    	try{
	    	String textLenght = NascarGUI.lenght.getText();
    		int intLenght = Integer.parseInt(textLenght);
	    	circuit.setLenght(intLenght);
	    	int previousSpeed = 0;
	    	while (Race.gameOver == 0)
	    	{
	    		this.accelerate();
	    		
	    		circuit.setLenght(intLenght - (this.getCurrentSpeed() + previousSpeed)); 
	    		previousSpeed = this.getCurrentSpeed();
	    		intLenght = intLenght - (this.getCurrentSpeed() + previousSpeed);
	    		winner = this.getCarName();
	    		if(circuit.getLenght() <= 0)
	    		{
	    			Race.gameOver = 1;
	    			winner = this.getCarName();
	    			
	    		}
	    	}
	    	} catch(NumberFormatException ex){ // handle your exception
		        System.out.println("Nu e numar cred");
		    }
	    	
	    }

	    public void brake () {
	    	currentSpeed --;
	    }
}
