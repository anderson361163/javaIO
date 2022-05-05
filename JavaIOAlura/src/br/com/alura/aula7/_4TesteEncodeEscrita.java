package br.com.alura.aula7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public class _4TesteEncodeEscrita {
	public static void main(String[] args) throws IOException {
		

	
		
		//Passando o UTF-8 como padrão de escrita
		PrintStream ps = new PrintStream("loremUTF8_2.txt", "UTF-8");

		ps.println("Existem muitas variações disponíveis de passagens de Lorem Ipsum, mas a maioria sofreu");
		ps.println();
		ps.println("algum tipo de alteração, seja por inserção de passagens com humor, ou palavras aleatórias");
		
		ps.close();
		
		System.out.println("**************");
		System.out.println("Encerrado");
		
		//ele fecha todo mundo
		ps.close();
	}
}


