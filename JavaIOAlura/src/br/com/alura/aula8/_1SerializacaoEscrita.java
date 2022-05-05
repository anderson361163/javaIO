package br.com.alura.aula8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _1SerializacaoEscrita {
	public static void main(String[] args) throws IOException {
		
		
		String nome = "Anderson da Silva Machado";
		
		ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("objeto.bin")); 
		
		oops.writeObject(nome);
		
		oops.close();
		System.out.println("******");
		System.out.println("Encerrado");
	}
}
