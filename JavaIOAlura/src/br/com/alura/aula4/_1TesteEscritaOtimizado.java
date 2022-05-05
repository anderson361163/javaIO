package br.com.alura.aula4;

import java.io.FileWriter;
import java.io.IOException;

public class _1TesteEscritaOtimizado {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("lorem5.txt");
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator());
		fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		fw.close();
		
		System.out.println("**************");
		System.out.println("Encerrado");
	}
}
