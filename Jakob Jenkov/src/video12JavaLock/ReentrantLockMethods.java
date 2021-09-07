package video12JavaLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethods {

	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();

//		how many times the current thread has locked this lock;
		int holdCount = lock.getHoldCount();

//		The ReentrantLock getQueueLength() method returns the number 
//		of threads waiting to lock the Lock.
		int queueLength = lock.getQueueLength();

//		The ReentrantLock hasQueuedThread(Thread thread) method takes a 
//		Thread as parameter and return true if that 
//		Thread is queued up waiting to lock the Lock, and false if not.
		boolean hasQueueThisThread = lock.hasQueuedThread(Thread.currentThread());

//		The ReentrantLock hasQueuedThreads() method returns true if any threads 
//		are queued up waiting to lock this Lock, and false if not.
		boolean hasQueuedThreads = lock.hasQueuedThreads();

//		The ReentrantLock isFair() method returns true if this Lock guarantees 
//		fairness among threads waiting to lock it,
//		and false if not. See Lock Fairness for more information about Lock fairness.
		boolean isFair = lock.isFair();

//		The ReentrantLock isLocked() method returns true if the Lock is currently locked,
//		and false if not.
		boolean isLocked = lock.isLocked();

//		The ReentrantLock isHeldByCurrentThread() method returns true if the Lock is held (locked) ¨
//		by the thread calling isHeldByCurrentThread(), and false if not.
		boolean isHeldByCurrentThread = lock.isHeldByCurrentThread();

	}

}
