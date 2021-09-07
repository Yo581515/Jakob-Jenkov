package video2JavaThread;

public class ThreadExample {

//	1)
//	public static class Mythread extends Thread {
//
//		@Override
//		public void run() {
//			System.out.println("My thread running");
//			System.out.println("My thread finished");
//		}
//	}

//	2)
//	public static class MyRunnable implements Runnable {
//
//		@Override
//		public void run() {
//			System.out.println("MyRunnable is running");
//			System.out.println("MyRunnable is finished");
//		}
//	}

	public static void main(String[] args) {

//		1)
//		Mythread t = new Mythread();

//		2)
//		Thread t = new Thread(new MyRunnable());

//		3)
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("MyRunnable running");
//				System.out.println("MyRunnable finished");
//			}
//		};
//		3)
//		Thread t = new Thread(r);

//		4)
//		Runnable lR = () -> {
//			String threadName = Thread.currentThread().getName();
//			System.out.println(threadName + " is running");
//			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//			}
//			
//			System.out.println(threadName + " is finished");
//		};
//		4)
//		Thread t = new Thread(lR, "Lambda Thread1");
//		Thread t2 = new Thread(lR, "Lambda Thread2");

//		t.start();
//		t2.start();
	
	}

}
