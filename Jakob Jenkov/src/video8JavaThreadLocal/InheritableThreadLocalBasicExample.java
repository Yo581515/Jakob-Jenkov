package video8JavaThreadLocal;

public class InheritableThreadLocalBasicExample {

	public static void main(String[] args) {

		ThreadLocal<String> localThread1 = new ThreadLocal<String>();
		InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

		Thread thread1 = new Thread(() -> {
			System.out.println("===== Thread 1 =====");
			localThread1.set("Thread 1 - ThreadLocal");
			inheritableThreadLocal.set("Thread 1 - InheritableThreadLocal");

			System.out.println(localThread1.get());
			System.out.println(inheritableThreadLocal.get());

			Thread childeThread = new Thread(() -> {
				System.out.println("===== ChiildThread ======");
				System.out.println(localThread1.get());
				System.out.println(inheritableThreadLocal.get());
			});
			childeThread.start();

		});

		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}

			System.out.println("===== Thread 2 =====");
			System.out.println(localThread1.get());
			System.out.println(inheritableThreadLocal.get());
		});
		thread1.start();
		thread2.start();

	}// Main
}// Class
