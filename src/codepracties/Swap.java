package codepracties;

public class Swap {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		swap(x, y);
		System.out.println("x= "+x + " y= " + y);
	}

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;

	}
	
	
	

}
