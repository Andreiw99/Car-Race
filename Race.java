
public class Race {

    public static void main(String[] args) {

    	int noCars=2;
    	Car cars[] = new Car[noCars];
        String name = "car";
        int speed= 0;
        int topSpeed = 4;
        int circuit = 5;
        String winner="default car";
        int ok=0;
        int previousSpeed = 0;
       
        Circuit circuits[]= new Circuit[noCars] ;
        for (int i = 0; i < noCars; i ++) {
        	cars[i] = new Car(name, topSpeed);
        	cars[i].setCurrentSpeed(speed);
        	cars[i].setTopSpeed(topSpeed);
        	cars[i].setName(name+i);
        	circuits[i] = new Circuit();
        	circuits[i].setLenght(circuit);
           
        }
     
        while(true)
        {
	        for(int i =0;i < noCars; i++)
	        {
	        	 cars[i].accelerate();
	             System.out.println("Masina " + cars[i].getName() + " are viteza "+ cars[i].getCurrentSpeed());
	             circuits[i].setLenght(circuit - (cars[i].getCurrentSpeed() + previousSpeed));
	             previousSpeed = cars[i].getCurrentSpeed();
	             circuits[i].getLenght();
	             if (circuits[i].getLenght() <= 0)
	             {
	 	        	winner = cars[i].getName();
	 	        	ok =1;
	             }
	        
	        }
	        if(ok==1)
	        {
	        	System.out.println("A castigat " + winner);
	        	break;
	        }
	        
        }
    }
}
