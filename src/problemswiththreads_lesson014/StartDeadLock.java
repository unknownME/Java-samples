package problemswiththreads_lesson014;

public class StartDeadLock implements Runnable {

	static FirstClass first = new FirstClass();
	static SecondClass second = new SecondClass();

	public static void main(String[] args) {

		Thread t = new Thread(new StartDeadLock());
		t.start();
		// execute deadlock
		first.start(second);
		
	}

	@Override
	public void run() {
		second.start(first);
	}
}

class FirstClass {

	synchronized void start(SecondClass secondClass) {
		System.out.println("Thread " + Thread.currentThread().getName() + " entered in method FirstClass.start()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trying to call other method from other class
		secondClass.current();
	}

	synchronized void current() {
		System.out.println("now we are in method FirstClass.current()");
	}

}

class SecondClass {

	synchronized void start(FirstClass firstClass) {
		System.out.println("Thread " + Thread.currentThread().getName() + " entered in method SecondClass.start()");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trying to call other method from other class
		firstClass.current();

	}

	synchronized void current() {
		System.out.println("now we are in method SecondClass.current()");
	}
}