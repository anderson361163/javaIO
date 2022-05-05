package br.com.alura.aula8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _3SerializacaoLeituraCliente {
	public static void main(String[] args) throws IOException,
	//Não existe a classe que você está mexendo
	ClassNotFoundException {
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson da Silva Machado");
		cliente.setProfissao("Analista de Sistema Java");
		cliente.setCpf("44433388855");

		
		escritaBinaria(cliente);
		leituraBinaria();
		
	}

	private static void leituraBinaria() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteSaida = (Cliente) ois.readObject();
		ois.close();
		System.out.println("nome: "+clienteSaida.getNome());
	}

	private static void escritaBinaria(Cliente cliente) throws IOException, FileNotFoundException {
		ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("cliente.bin")); 
		oops.writeObject(cliente);
		oops.close();
	}
}
