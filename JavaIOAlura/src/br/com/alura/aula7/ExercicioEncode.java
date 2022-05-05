package br.com.alura.aula7;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ExercicioEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.out.println("------------------------");
		System.out.println("Exerc�cio");
		String s1 = "13� �rg�o Oficial";
		byte[] bytes = s1.getBytes();
		String s2 = new String(bytes, "UTF-8");
		System.out.println(s2);
		System.out.println("------------------------");
		System.out.println("Solu��o");
		System.out.println("A codifica��o padr�o �: "+Charset.defaultCharset());
		System.out.println("A codifica��o utilizada � UTF-8");
		String correta = new String(bytes, Charset.defaultCharset());
		System.out.println("A codifica��o da string precisa ser trocada para padr�o");
		System.out.println(correta);
		System.out.println("------------------------");
	}
}
