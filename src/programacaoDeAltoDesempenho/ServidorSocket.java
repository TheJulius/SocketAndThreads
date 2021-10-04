package programacaoDeAltoDesempenho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = null;
		Socket conexao = null;
		BufferedReader entrada = null;
		
		try {
			
			servidor = new ServerSocket(7000);
			conexao = servidor.accept();
			entrada = new BufferedReader (new InputStreamReader(conexao.getInputStream()));

			
			do {
				String texto = entrada.readLine();
				
				if (texto == null) {
					break;
				}
				
					String[] msg = texto.split(" ");
				
				new Thread(new ThreadSocket(Integer.parseInt(msg[1]), msg[2], msg[3])).start();
			
			} while (!"sair".equals(entrada.toString()));
			
		} catch (IOException e) {
			System.out.println("Algo errado aconteceu");
		} finally {
			conexao.close();
			servidor.close();
		}
	}

}
