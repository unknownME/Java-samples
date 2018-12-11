package problemswiththreads_lesson014;

public class PreventDeadLock implements Runnable {

	static FirstClass2 first = new FirstClass2();
	static SecondClass2 second = new SecondClass2();

	public static void main(String[] args) {

		Thread t = new Thread(new PreventDeadLock());
		t.start();

	}

	@Override
	public void run() {
		try {
			first.start(second);
			// detecting the deadlock
			if (first instanceof FirstClass2) {
				throw new Exception("Deadlock is detected...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class FirstClass2 {

	synchronized void start(SecondClass2 second) {
		System.out.println("Thread " + Thread.currentThread().getName() + " entered in method FirstClass2.start()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trying to call other method from other class
		second.current();
	}

	synchronized void current() {
		System.out.println("now we are in method FirstClass2.current()");
	}

}

class SecondClass2 {

	synchronized void start(FirstClass2 firstClass) {
		System.out.println("Thread " + Thread.currentThread().getName() + " entered in method SecondClass2.start()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trying to call other method from other class
		firstClass.current();

	}

	synchronized void current() {
		System.out.println("now we are in method SecondClass2.current()");
	}
}