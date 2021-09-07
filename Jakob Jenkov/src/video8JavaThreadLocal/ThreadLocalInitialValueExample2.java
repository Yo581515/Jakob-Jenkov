package video8JavaThreadLocal;

public class ThreadLocalInitialValueExample2 {

	public static void main(String[] args) {

		ThreadLocal<MyObjekt> threadLocal1 = new ThreadLocal<MyObjekt>() {
			@Override
			protected MyObjekt initialValue() {
				return new MyObjekt();
			}
		};

		ThreadLocal<MyObjekt> threadLocal2 = ThreadLocal.withInitial(() -> {
			return new MyObjekt();
		});

		Thread thread1 = new Thread(() -> {
			System.out.println("Thread1, threadlocal1: " + threadLocal1.get());
			System.out.println("Thread1, threadlocal2: " + threadLocal2.get());
		});

		Thread thread2 = new Thread(() -> {
			System.out.println("Thread2, threadlocal1: " + threadLocal1.get());
			System.out.println("Thread2, threadlocal2: " + threadLocal2.get());
		});

		thread1.start();
		thread2.start();

	}

}
