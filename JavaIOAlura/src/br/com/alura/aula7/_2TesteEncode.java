package br.com.alura.aula7;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _2TesteEncode {
	public static void main(String[] args) throws IOException {
		

		Scanner leitor = new Scanner(new File("arquivo.csv"), "UTF-8");

		while(leitor.hasNext()){
			String linha = leitor.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			
			//SERVE PARA DEFINIR QUE O PADRÃO DE LEITURA DEVE SER AMERICANO, OU SEJA 
			// PARA NUMEROS EM DOUBLE ELE CONVERTE 
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			
			
			
			String[] valores = linha.split(",");
			System.out.println(Arrays.toString(valores));
		}
			
		
		leitor.close();
	
		
	}
}
