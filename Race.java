
public class Race {

    public static void main(String[] args) {

    	int noCars=100;
    	Car cars[] = new Car[noCars];
        String name = "car";
        int speed= 0;
        int circuit = 500;
        String winner="default car";
        int ok=0;
       
        Circuit circuits[]= new Circuit[noCars] ;
        for (int i = 0; i < noCars; i ++) {
        	cars[i] = new Car(name);
        	cars[i].setSpeed(speed);
        	cars[i].setName(name+i);
        	circuits[i] = new Circuit();
        	circuits[i].setLenght(circuit);
           
        }
     
        while(true)
        {
	        for(int i =0;i < noCars; i++)
	        {
	        	 cars[i].accelerate();
	             System.out.println("Masina " + cars[i].getName() + " are viteza "+ cars[i].getSpeed());
	             circuits[i].setLenght(circuit - cars[i].getSpeed());
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
