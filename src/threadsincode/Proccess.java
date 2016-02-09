package threadsincode;

import java.util.Scanner;

public class Proccess {
	public static void main(String[] args) throws InterruptedException {
		Proccess p = new Proccess();
		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					p.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					p.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();

		t2.start();
		t.join();

		t2.join();
	}

	public void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer block");
			wait();
			System.out.println("Consumed");

		}

	}

	public void consumer() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Thread.sleep(1000);

		synchronized (this) {
			System.out.println("Waiting for KEy event");
			sc.nextLine();
			notify();
			Thread.sleep(10000);

		}

	}
}
