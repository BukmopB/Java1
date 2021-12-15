import java.util.Iterator;

import static java.lang.System.out;

class MyThread extends Thread {
	int fromInt;
	int toInt;
	
	public MyThread(int fromInt, int toInt) {
		super();
		this.fromInt = fromInt;
		this.toInt = toInt;
	}

	@Override
	public void run() {
		for (int i = fromInt; i <= toInt; i++) {
			out.printf("%s : %d\n", this.getName(), i);
		}
	}
}


class MySuperThread implements Runnable {
	int fromInt;
	int toInt;
	
	public MySuperThread(int fromInt, int toInt) {
		super();
		this.fromInt = fromInt;
		this.toInt = toInt;
	}

	@Override
	public void run() {
		for (int i = fromInt; i <= toInt; i++) {
			if (Thread.interrupted()) {
				out.printf("Interrupting %s\n", Thread.currentThread().getName());
				return;
			}
			out.printf("%s : %d\n", Thread.currentThread().getName(), i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		
		Thread t0 = new MyThread(0, 50);
		Thread t1 = new MyThread(50, 100);
		Thread t2 = new Thread(new MySuperThread(100,1500));
		
		final int fromInt = 150;
		int toInt = 200; // effective final
		Thread t3 = new Thread(
				new Runnable() {
					
					public void run() {
						for (int i = fromInt; i <= toInt; i++) {
							out.printf("%s : %d\n", Thread.currentThread().getName(), i);
						}
					}
				}
			);
		Thread t4 = new Thread(() -> {
			for (int i = fromInt; i <= toInt; i++)
				out.printf("%s : %d\n", Thread.currentThread().getName(), i);
		});
		
		t0.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		t2.setDaemon(true);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.stop(); // deprecated
		t2.interrupt();
		
		System.out.printf("Is Alive for t3: %s\n", t3.isAlive());
		System.out.printf("Is State for t3: %s\n", t3.getState());
		
		out.println(Thread.currentThread().getName());

	}

}
