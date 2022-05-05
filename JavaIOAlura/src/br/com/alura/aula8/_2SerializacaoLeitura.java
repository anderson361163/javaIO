package br.com.alura.aula8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _2SerializacaoLeitura {
	public static void main(String[] args) throws IOException,
	//Não existe a classe que você está mexendo
	ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println("nome: "+nome);
	
	}
}
