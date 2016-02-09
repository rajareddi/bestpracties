package threadsincode;

public class TwoSums {

	private int sum1 = 0;
	private int sum2 = 0;

	public static void main(String[] args) {

	}

	public void add(int val1, int val2) {
		synchronized (this) {
			this.sum1 += val1;
		}
		synchronized (this) {
			this.sum2 += val2;
		}
	}
}