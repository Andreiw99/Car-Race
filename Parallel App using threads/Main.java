public class Main {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Race race = new Race();
		race.start();
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	}

}
