package edu.caio.exercicios.Ex7;

public class MinhaMain {
	public static void main(String[] args) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		
		p[0] = new Pessoa("pedro", 22, "M");
		p[1] = new Pessoa("Caio", 20, "M");
		
		
		l[0] = new Livro("Pequeno Principe", "Gilles Vilenev", 125, p[0]);
		l[1] = new Livro("Aprendendo Java", "Pedor Paulo", 500, p[1]);
		l[2] = new Livro("Código limpo", "Orweel", 300, p[1]);
		
		
		l[0].abrir();
		l[0].folear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
	}
}
