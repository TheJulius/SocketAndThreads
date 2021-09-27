package programacaoDeAltoDesempenho;

public class ThreadSocket implements Runnable {
	
	private String str;
	private int n;
	
	public ThreadSocket (int n, String str) {
		this.str = str;
		this.n = n;
	}
	
	public void run() {
		
		int contador = n-1;
		
		for (int i = 0; i < n; i++) {
			System.out.println(str + " " + i + " | " + contador );
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
