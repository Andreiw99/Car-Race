public class Race extends Thread {
	static int noCars=100;
	Car cars[] = new Car[noCars];
    static String name = "car";
    static int speed= 0;
    static int topSpeed = 4;
    static int circuit = 50000000;
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
