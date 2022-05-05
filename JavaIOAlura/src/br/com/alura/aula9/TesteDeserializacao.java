package br.com.alura.aula9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.alura.aula8.Cliente;
import br.com.alura.modelo.ContaCorrente;

public class TesteDeserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		ContaCorrente clienteSaida = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println("nome: "+clienteSaida.getTitular());
	
	}
}
