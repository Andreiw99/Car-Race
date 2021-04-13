import java.util.Random;

public class Race extends Thread {
	static int noCars=100;
	Car cars[] = new Car[noCars];
	static Random rand = new Random();
    static String name = "car";
    static int speed= 0;
    static int topSpeed = rand.nextInt(100);
    int ok=0;
    static volatile int gameOver = 0;
    
    
    public void run() {
    	for(int i =0 ;i< noCars;i++)
    	{
    		cars[i] = new Car(name + i, topSpeed);
    		cars[i].start();
    	}
    }
}
