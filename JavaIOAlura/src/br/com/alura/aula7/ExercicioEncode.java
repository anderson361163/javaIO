package br.com.alura.aula7;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ExercicioEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.out.println("------------------------");
		System.out.println("Exercício");
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes();
		String s2 = new String(bytes, "UTF-8");
		System.out.println(s2);
		System.out.println("------------------------");
		System.out.println("Solução");
		System.out.println("A codificação padrão é: "+Charset.defaultCharset());
		System.out.println("A codificação utilizada é UTF-8");
		String correta = new String(bytes, Charset.defaultCharset());
		System.out.println("A codificação da string precisa ser trocada para padrão");
		System.out.println(correta);
		System.out.println("------------------------");
	}
}
