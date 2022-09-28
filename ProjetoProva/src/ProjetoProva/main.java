package ProjetoProva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu objetivo: 1 - Inserir nome 2 - Ver lista de nomes 3 - Apagar arquivo\n");
		int op;
		op = entrada.nextInt();
		File arquivo = new File("arquivo.txt");
		arquivo.createNewFile();
	
		
		switch (op) {
		case 1:
			try {
				
				Scanner entrada2 = new Scanner(System.in);
				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter buff_fw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(buff_fw);
				System.out.println("Qual nome quer inserir?\n");
				String nome;
				nome = entrada2.next();
				
				entrada2.close();
			
			}
			catch(IOException ex) {
				
			}
			
			break;
		case 2:
			FileReader ler = new FileReader(arquivo);
			BufferedReader lerb = new BufferedReader(ler);	
			String linha = lerb.readLine();
			
			                               
				
			while(linha != null) {
				System.out.println(linha);
				linha = lerb.readLine();			}
			
			File fil = new File("/");
			File fi [] = fil.listFiles();
			for(int i = 0; i<fi.length;i++) {
				System.out.println();
			}
			break;
		case 3:
			arquivo.delete();
			break;
		}
		
		entrada.close();
	}
	

}
