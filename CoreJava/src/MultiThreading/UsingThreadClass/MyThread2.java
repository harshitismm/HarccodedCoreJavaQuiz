package MultiThreading.UsingThreadClass;

public class MyThread2 extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Suhani's Thread"+i);
		}
		
	}
}
