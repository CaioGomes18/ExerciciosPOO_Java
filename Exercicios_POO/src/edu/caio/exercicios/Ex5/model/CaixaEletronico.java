package edu.caio.exercicios.Ex5.model;

import edu.caio.exercicios.Ex5.dominio.*;
import java.util.Scanner;
public class CaixaEletronico 
{
	static String opcao = "0";
	static double valorDeposito;
	static double valorSaque;
	static double aux;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String []args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		
		ContaBancaria contaPessoa = new ContaBancaria();
		
		System.out.println("Digite o nome do titular : ");
		contaPessoa.setNome(input.next());
		
		System.out.println("Digite o CPF do titular : ");
		contaPessoa.setCpf(input.next());
		
		System.out.println("Digite o Email do titular : ");
		contaPessoa.setEmail(input.next());
		
		System.out.println("Digite o numero da conta do titular : ");
		contaPessoa.setNumeroDaConta(input.nextInt());
		
		
		System.out.println("Digite o saldo do titular : ");
		contaPessoa.setSaldo(input.nextDouble());
		
		
		realizar(contaPessoa);
		contaPessoa.imprime();
	}
	
	static void realizar(ContaBancaria contaPessoa) {
		while(!contaPessoa.getLoop()) {
			
			System.out.println("\t0 - sair");
			System.out.println("\t1 - Depositar");
			System.out.println("\t2 - Sacar");
			System.out.println("\t3 - Exibir Saldo");
			
			opcao = input.next();
			
			switch(opcao) 
			{
				case "0":
					contaPessoa.setLoop();
					break;
				
				case "1":
					System.out.println("Digite o valor que deseja depositar : ");
					aux = input.nextDouble();
					valorDeposito = contaPessoa.getSaldo() + aux;
					contaPessoa.setSaldo(valorDeposito);
					break;
			
				case "2":
					System.out.println("Digite o valor que deseja sacar : ");
					aux = input.nextDouble();
					valorSaque = contaPessoa.getSaldo() - aux ;
					contaPessoa.setSaldo(valorSaque);
					break;
				
				case "3":
					System.out.println("----Valor em conta-----");
					System.out.println("---- " + contaPessoa.getSaldo() + "----" );
					System.out.println("-----------------------");
					break;
				
			}
			
		}
	}
}
