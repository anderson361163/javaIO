package br.com.alura.aula4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintStream;

public class _3TesteEscritaOtimizando {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		//É um formato antigo bastante popular do java 1.0
		PrintStream ps = new PrintStream("lorem6.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		ps.close();
		
		System.out.println("**************");
		System.out.println("Encerrado");
	}
}
