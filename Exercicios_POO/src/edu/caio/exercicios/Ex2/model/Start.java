package edu.caio.exercicios.Ex2.model;

import java.util.Scanner;
import edu.caio.exercicios.Ex2.util.*;

public class Start 
{
	
	private static ContaCorrente contaCadastrada = null;
	private static ContaCorrente conta = new ContaCorrente();
	static Scanner input = new Scanner(System.in);
	private static Validacoes validacao = new Validacoes();
	
	public static void main(String []args) 
	{
		
		
		String opcao = "";
		final String FALSO = "NÃO";
		final String VERDADEIRO = "SIM";
		String isOrNot = "";
		
		while(true) 
		{
			
			if(contaCadastrada == null) 
			{
				System.out.println("Digite o número da conta : ");
				conta.setNumeroConta(input.nextInt());
				System.out.println("Digite o saldo da conta : ");
				conta.setSaldo(input.nextDouble());
				System.out.println("Digite se a conta é especial ou não, digite sim ou não.");
				isOrNot = input.next();
				isOrNot = isOrNot.toUpperCase();
				if(isOrNot.equals(FALSO)) 
				{
					conta.setStatusEspecial(false);
				}
				else if(isOrNot.equals(VERDADEIRO)) 
				{
					conta.setStatusEspecial(true);
				}
				else 
				{
					System.out.println("Você digitou uma opção incorreta");
					boolean entradaValida = false;
	                while (!entradaValida) 
	                {
	                    System.out.println("Digite se a conta é especial ou não (sim ou não):");
	                    isOrNot = input.next().toUpperCase();
	                    if(isOrNot.equals(FALSO)) 
	                    {
	                        conta.setStatusEspecial(false);
	                        entradaValida = true;
	                    } else if(isOrNot.equals(VERDADEIRO)) 
	                    {
	                        conta.setStatusEspecial(true);
	                        entradaValida = true;
	                    } else 
	                    {
	                        System.out.println("Opção inválida. Por favor, digite 'sim' ou 'não'.");
	                    }
	                }
	            
				
				}
				System.out.println("Digite o limeite da conta : ");
				conta.setLimite(input.nextDouble());
				contaCadastrada = conta;
			}
			
			
			System.out.println("1 - Sacar dinheiro.");
			System.out.println("2 - Depositar dinheiro.");
			System.out.println("3 - consultar Saldo");
			opcao = input.next();
			
			switch(opcao) {
			
			case "1":
				double valorAretirar = 0;
				System.out.println("digite quanto deseja retirar : ");
				valorAretirar = input.nextDouble();
				double valor = saque(valorAretirar);
				if(valor < 0) {
					System.out.println("Você não tem dinheiro suficiente para realizar está operação");
				}
				else {
					conta.setSaldo(valor);
					System.out.println("Saque Realizado no valor de " + valorAretirar);
					System.out.println("Seu novo saldo é de : " + conta.getSaldo()); 
				}
				System.out.println("\n----------------------");
				break;
			case "2" :
				double valorAdepositar = 0;
				System.out.println("qunato deseja depositar : ");
				valorAdepositar = input.nextDouble();
				conta.setSaldo(conta.getSaldo() + valorAdepositar);
				System.out.println("------------------------");
				System.out.println(conta.getSaldo());
				System.out.println("\n----------------------");
				break;
			
			case "3":
				System.out.println("----------------------");
				System.out.println("----Saldo da Conta----");
				System.out.println("R$ : " + conta.getSaldo());
				System.out.println("----------------------");
				System.out.println("\n----------------------");
				break;
			}
			
			
		}
	
	}
	
	public static double saque(double valorAretirar) 
	{
		
		boolean valido = validacao.validaSaldo(valorAretirar, conta.getSaldo());
		
		if(valido) {
			return conta.getSaldo() - valorAretirar;
		}
		else {
			return -1;
		}

	}
}
