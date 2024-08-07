package edu.caio.exercicios.EXE20;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<Conta> account;
	
	public Banco() {
		 account = new ArrayList<Conta>();
	}
	
	
	public void add_conta(Conta conta) {
		account.add(conta);
	}
	
	public void remove_conta(Conta conta) {
		account.remove(conta);
	}


	public void aumentandoBalanco(Conta conta, double valorDeposito) {
		conta.deposito(valorDeposito);
	}
	
	public void diminuindoBalanco(Conta conta, double valorSaque) {
		conta.sacar(valorSaque);
	}
	
	

	public ArrayList<Conta> getAccount() {
		return account;
	}
	
	
	
}
