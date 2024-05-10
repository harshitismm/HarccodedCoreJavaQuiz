package MultiThreading.UsingThreadClass;

public class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Harshit's Thread"+i);
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		MyThread thread= new MyThread();
		MyThread2 thread2= new MyThread2();
		thread2.start();
//		thread.sleep(1000);
		thread.start();		
	}
}


