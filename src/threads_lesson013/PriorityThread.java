package threads_lesson013;

public class PriorityThread implements Runnable{

	@Override
	synchronized public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(i + " current thread with " + Thread.currentThread().getName() + " priority");
		}
	}

}
