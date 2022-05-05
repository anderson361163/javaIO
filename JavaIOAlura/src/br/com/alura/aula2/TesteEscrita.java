package br.com.alura.aula2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo
		OutputStream fos =
				new FileOutputStream("lorem1.txt");

		//converte os bytes em caracteres
		Writer osw = new OutputStreamWriter(fos);

		//ele joga os caracteres dentro de um array
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		
		bw.close();
	}
}
