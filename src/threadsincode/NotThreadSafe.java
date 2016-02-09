package threadsincode;

public class NotThreadSafe {
	StringBuilder builder = new StringBuilder();

	public void add(String text) {
		this.builder.append(text);
	}

	public static void main(String[] args) {
		NotThreadSafe sharedInstance = new NotThreadSafe();

		new Thread(sharedInstance.new MyRunnable(sharedInstance)).start();
		new Thread(sharedInstance.new MyRunnable(sharedInstance)).start();
	}

	private class MyRunnable implements Runnable {
		NotThreadSafe instance = null;

		public MyRunnable(NotThreadSafe instance) {
			this.instance = instance;
		}

		public void run() {
			this.instance.add("some text");
		}
	}
}