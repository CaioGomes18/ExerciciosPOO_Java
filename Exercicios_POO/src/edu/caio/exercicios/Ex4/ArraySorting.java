package edu.caio.exercicios.Ex4;

import  java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) 
	{
		String []letras = {"A", "C", "V", "B", "M", "F"};
			
		Arrays.sort(letras);
		int n = letras.length;
		
		for(int i = 0; i<n; i++) 
		{
				System.out.println(letras[i]);
		}
	}
}
