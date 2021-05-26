import java.util.Random;

public class Race extends Thread {
	String textNoCars = NascarGUI.no_cars.getText();
	int intNoCars = Integer.parseInt(textNoCars);
	Car cars[] = new Car[intNoCars];
	static Random rand = new Random();
    static String name = "car";
    static int speed= 0;
    static int topSpeed = rand.nextInt(100);
    int ok=0;
    static volatile int gameOver = 0;
    
    
    public void run() {
    	for(int i =0 ;i< intNoCars;i++)
    	{
    		cars[i] = new Car(name + i, topSpeed);
    		cars[i].start();
    	}
    }
}
