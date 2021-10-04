package programacaoDeAltoDesempenho;

public class ThreadSocket extends Thread{
	
	private String str;
	private int n;
	private String prioridade;
	
	public ThreadSocket (int n, String str, String msg) {
		this.str = str;
		this.n = n;
		this.prioridade = msg;
	}
	
	public void run() {
		
		int contador = n;
		setPriority(Integer.parseInt(prioridade));
		
		for (int i = 0; i < n; i++) {
			System.out.println(str + " " + i + " | " + contador + " | " + prioridade);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
