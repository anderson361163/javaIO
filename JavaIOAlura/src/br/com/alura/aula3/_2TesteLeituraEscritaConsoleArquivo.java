package br.com.alura.aula3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _2TesteLeituraEscritaConsoleArquivo {
	public static void main(String[] args) throws IOException {

		System.out.println("Escreva");
		
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("lorem4.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {

        bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

	}
}
