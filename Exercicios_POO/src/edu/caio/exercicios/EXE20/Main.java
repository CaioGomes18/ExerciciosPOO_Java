package edu.caio.exercicios.EXE20;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		Banco bank = new Banco();
		
		Conta conta1 = new Conta("518", "Isaquias", 150000);
		Conta conta2 = new Conta("517", "Fernada", 11000);
		Conta conta3 =  new Conta("516", "Lucas", 120);
		
		bank.add_conta(conta1);
		bank.add_conta(conta2);
		bank.add_conta(conta3);
		
		ArrayList<Conta> ListaDecontas = bank.getAccount();
		
		
		System.out.println("lista de contas");
		
		
		for(Conta contas : ListaDecontas) {
			contas.imprimirDadosDaConta();
		}
		
		
		System.out.println("\n- Depositando valor na Conta1");
		
		bank.aumentandoBalanco(conta1, 1000);
		System.out.println("\n- Depois de depositar : " + conta1.getBalanco());
		
		
		System.out.println("\n- Tirando valor da conta 2");
		bank.diminuindoBalanco(conta2, 4000);
		System.out.println("\n- Depois de tirar o valor : " + conta2.getBalanco());
		
		System.out.println("Nenhuma alteração na conta 3");
		conta3.imprimirDadosDaConta();

		
	}
}
