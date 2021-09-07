package video8JavaThreadLocal;

public class ThreadLocalRemoveExample {
	public static void main(String[] args) {

		ThreadLocal<String> threadLocal = new ThreadLocal<>();

		Thread thread1 = new Thread(() -> {
			threadLocal.set("Thread1");

			String value = threadLocal.get();
			System.out.println(value);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			threadLocal.remove();
			value = threadLocal.get();
			System.out.println(value);

		});

		Thread thread2 = new Thread(() -> {
			threadLocal.set("Thread2");
			String value = threadLocal.get();
			System.out.println(value);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			value = threadLocal.get();
			System.out.println(value);

			threadLocal.remove();
			value = threadLocal.get();
			System.out.println(value);

		});

		thread1.start();
		thread2.start();

	}
}
