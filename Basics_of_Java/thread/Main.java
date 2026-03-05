package thread;

public class Main {

	static final Object lock=new Object();
	public static void main(String args[]) throws Exception{
		Thread worker=new Thread(
				()->
				{
					try {
						System.out.println("Worker is sleeping");
						Thread.sleep(2000);
						synchronized(lock) {
						System.out.println("Worker going to waiting state");
						lock.wait();
					}
					System.out.println("Worker: resuumed and finishing");	
					}
					
					catch(InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
				);
		
		System.out.println("Sate after creation: "+worker.getState());
		worker.start();
		Thread.sleep(100);
		System.out.println("State after starting: "+worker.getState());
		
		Thread.sleep(500);
		System.out.println("Stste during sleep: "+worker.getState());
		
		Thread.sleep(2000);
		System.out.println("Stste during sleep: "+worker.getState());
		
		synchronized(lock) {
			lock.notify();
		}
		
		worker.join();
		System.out.println("State after complete: "+worker.getState());
	}
}