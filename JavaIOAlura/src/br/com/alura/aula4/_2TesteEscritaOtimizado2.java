package br.com.alura.aula4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _2TesteEscritaOtimizado2 {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("lorem5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		bw.close();
		
		System.out.println("**************");
		System.out.println("Encerrado");
	}
}
