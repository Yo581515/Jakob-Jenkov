package video11ThreadPools;

public class ThreadPoolMain {

	public static void main(String[] args) throws Exception {

		ThreadPool threadPool = new ThreadPool(3, 10);
		
//		threadPool.execute(() -> {
//			String message = Thread.currentThread().getName() + ": Task " + 4;
//			System.out.println(message);
//		});
		

		for (int i = 0; i < 10; i++) {

			int taskNo = i;
			threadPool.execute(() -> {
				String message = Thread.currentThread().getName() + ": Task " + taskNo;
				System.out.println(message);
			});
		}

		threadPool.waitUntilAllTasksFinished();
		threadPool.stop();

	}
}