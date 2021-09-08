package video12JavaLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	public static void main(String[] args) throws InterruptedException {
		
//		https://www.youtube.com/watch?v=mTGdtC9f4EU&list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4

//		Lock lock = new ReentrantLock(true);
//		lock.lock();
////		to Do...
//		lock.unlock();

//		1)
		lockBasics();

//		Thread.sleep(4000);
//		System.out.println();

//		2)
//		lockInterrupted();

//		Thread.sleep(4000);
//		System.out.println();
//      3)
//		tryLock();

	}

//	1)
	private static void lockBasics() {
		Lock lock = new ReentrantLock(true);
		Runnable runnable = () -> {
			lockSleepUnlock(lock, 1000);
		};

		Thread thread1 = new Thread(runnable, "Thread 1");
		Thread thread2 = new Thread(runnable, "Thread 2");
		Thread thread3 = new Thread(runnable, "Thread 3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
//
	private static void lockSleepUnlock(Lock lock, int timeMillis) {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + " holds the lock.");
			sleep(timeMillis);
		} finally {
			lock.unlock();
		}
	}
//
	private static void sleep(int timeMillis) {
		try {
			Thread.sleep(timeMillis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	2)
//	private static void lockInterrupted() {
//		Lock lock = new ReentrantLock();
//		Thread.currentThread().interrupt();
//
//		try {
//			lock.lockInterruptibly();
//			lock.unlock();
//		} catch (Exception e) {
//			System.out.println("thread interurupted");
//		}
//	}

//	3)
	private static void tryLock() {
		Lock lock = new ReentrantLock();

		try {
			boolean lockSuccesful = lock.tryLock();
			System.out.println("Lock successful: " + lockSuccesful);
		} finally {
			lock.unlock();
		}

	}

}
