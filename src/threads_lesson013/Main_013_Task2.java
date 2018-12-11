package threads_lesson013;

public class Main_013_Task2 {

	public static void main(String[] args) {

		Thread firstThread = new Thread(new OtherThreadOne(), "first");
		Thread secondThread = new Thread(new OtherThreadTwo(), "second");

		firstThread.start();
		secondThread.start();

		int[] array = new int[50];
		System.out.println(Thread.currentThread().getName() + " thread STARTED\n=================");
		for (int i = 0; i < array.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			array[i] = i;
		}
		System.out.println("array of " + Thread.currentThread().getName() + " thread filled successfully");
		System.out.println(Thread.currentThread().getName() + " thread STOPPED\n -------------------------");
	}

}

class OtherThreadOne implements Runnable {

	int[] array = new int[50];

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread STARTED\n=================");
		for (int i = 0; i < array.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			array[i] = i;
		}
		System.out.println("array of " + Thread.currentThread().getName() + " thread filled successfully");
		System.out.println(Thread.currentThread().getName() + " thread STOPPED\n -------------------------");
	}
}

class OtherThreadTwo implements Runnable {

	int[] array = new int[50];

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread STARTED\n=================");
		for (int i = 0; i < array.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			array[i] = i;
		}
		System.out.println("array of " + Thread.currentThread().getName() + " thread filled successfully");
		System.out.println(Thread.currentThread().getName() + " thread STOPPED\n -------------------------");
	}

}
