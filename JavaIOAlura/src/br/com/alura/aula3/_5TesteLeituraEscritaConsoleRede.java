package br.com.alura.aula3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class _5TesteLeituraEscritaConsoleRede {
	public static void main(String[] args) throws IOException {
		
		
		Socket s = new Socket();
		
		
		System.out.println("Escreva");

		InputStream fis = s.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = s.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {

			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
		
	}
}
