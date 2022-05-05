package br.com.alura.aula7;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class _1TesteEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		String c = "C";
		System.out.println(c.codePointAt(0));
		
		Charset defaultCharset = Charset.defaultCharset();
		System.out.println("Tipo de chartSet: " + defaultCharset.displayName());
		
		byte[] bytes = c.getBytes();
		
		System.out.println("Quantos bytes tem: "+bytes.length+" bytes utilziados pelo windows-1252: "+bytes);
		
		System.out.println("-------------------------");
		
		//muda a codificação
		byte[] bytesWindows = c.getBytes("windows-1252");
		
		System.out.println("Quantos bytes tem: "+bytesWindows.length+" bytes utilziados pelo windows-1252: "+bytesWindows);
		
		System.out.println("-------------------------");
		
		//muda a codificação
		byte[] bytesUTF8 = c.getBytes("UTF-8");
		
		System.out.println("Quantos bytes tem: "+bytesUTF8.length+" bytes utilziados pelo windows-1252: "+bytesUTF8);
		
		System.out.println("-------------------------");
		
		//muda a codificação
		byte[] bytesUTF16 = c.getBytes("UTF16");
		
		System.out.println("Quantos bytes tem: "+bytesUTF16.length+" bytes utilziados pelo windows-1252: "+bytesUTF16);
		
		System.out.println("-------------------------");
		
		//a partir do java 7 tem essa nova codificação
		byte[] bytesconstanteUTF16 = c.getBytes(StandardCharsets.UTF_16);
		
		System.out.println("Quantos bytes tem: "+bytesconstanteUTF16.length+" bytes utilziados pelo windows-1252: "+bytesconstanteUTF16);
		
		System.out.println("-------------------------");
		
		
		//Imprime os bytes na codificação recebida
		String stringWindows1252 = new String(bytesWindows, "windows-1252");
		System.out.println(stringWindows1252);
		
		System.out.println("-------------------------");
		
		//Imprime os bytes na codificação recebida
		String stringUTF16 = new String(bytesWindows, "UTF-16");
		System.out.println("Caractere codificado incorreto: "+stringUTF16);
		
		
		
	}
}
