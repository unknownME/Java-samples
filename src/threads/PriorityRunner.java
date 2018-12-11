package threads;

public class PriorityRunner {

	public static void main(String[] args) {
		Thread firstThread = new Thread(new PriorityThread(), "MAX");
		Thread secondThread = new Thread(new PriorityThread(), "NORM");
		Thread thirdThread = new Thread(new PriorityThread(), "MIN");
		
		firstThread.setPriority(Thread.MAX_PRIORITY);
		secondThread.setPriority(Thread.NORM_PRIORITY);
		thirdThread.setPriority(Thread.MIN_PRIORITY);
		
		thirdThread.start();
		firstThread.start();
		secondThread.start();
		
		
	}
	
	
	
		
	
	
}
