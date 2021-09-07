package video8JavaThreadLocal;



public class ThreadLocalLazyInitExample {

	public static void main(String[] args) {

		ThreadLocal<String> threadLocal1 = new ThreadLocal<>();

		String value = threadLocal1.get();

		if (value == null) {
			threadLocal1.set("Lazily set value");
			value = threadLocal1.get();
		}
		System.out.println(value);
	}

}
