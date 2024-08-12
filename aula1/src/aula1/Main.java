package aula1;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		
		String path = "./src/aula1/arq.txt";
		
		try {
			//Fluxo de saida de um arquivo
			OutputStream os = new FileOutputStream(path);
			Writer wr = new OutputStreamWriter(os);
			BufferedWriter br = new BufferedWriter(wr);
			
			br.write("Escrevendo nosso primeiro arquivo em Java!");
			br.newLine();
			br.newLine();
			br.write("Outra linha!");
			br.close();
		} catch (Exception e) {
			System.out.println ("Erro");
	}

	}
}
