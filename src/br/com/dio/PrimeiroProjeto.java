package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 9;
		System.out.println("Hello world!!" + (b+a));
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livro {
	private String nome;
	private String ano;
		
}