package br.com.alura.aula9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.alura.aula8.Cliente;
import br.com.alura.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson da Silva Machado");
		anderson.setProfissao("Analista de Sistema Java");
		anderson.setCpf("44433388855");

		ContaCorrente cc = new ContaCorrente(2222, 333);
		
		//cc.setTitular(anderson);
		cc.deposita(222.3);
		
		
		
		escritaBinaria(anderson);
		//leituraBinaria();
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
