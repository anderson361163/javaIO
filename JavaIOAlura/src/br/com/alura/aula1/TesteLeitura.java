package br.com.alura.aula1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		InputStream fis =
				new FileInputStream("lorem.txt");

		//converte os bytes em caracteres
		Reader isr = new InputStreamReader(fis);

		//ele joga os caracteres dentro de um array
		BufferedReader br = new BufferedReader(isr);
		
		String linha =br.readLine();
		while(linha != null){
			
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//ele fecha todo mundo
		br.close();
		
	}
}

