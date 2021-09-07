package video2JavaThread;

public class StoppableRunnable implements Runnable {
	private boolean stopRequest = false;

	public synchronized void requestStop() {
		this.stopRequest = true;
	}

	public synchronized boolean isStopRequested() {
		return this.stopRequest;
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	@Override
	public void run() {
		System.out.println("StoppableRunnable Running ");
		while (!isStopRequested()) {
			sleep(1000);
			System.out.println("...");
		}
		System.out.println("StoppableRunnable Stopped");

	}

//	Main
	public static void main(String[] args) {
		StoppableRunnable stoppableRunnable = new StoppableRunnable();
		Thread t = new Thread(stoppableRunnable, "The Thread");
		t.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("requesting stop");
		stoppableRunnable.requestStop();
		System.out.println("stop requested");
	}

}
