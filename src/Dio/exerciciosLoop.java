package Dio;

import java.util.Scanner;

public class exerciciosLoop {

	public static void main(String[] args) {
		
Scanner tlc = new Scanner (System.in);
		
		String nome;
		int idade ;
		
		
		while (true) {
			System.out.println("Qual é seu nome?");
			
			nome = tlc.next();
			
			if (nome.equals("0")) break;
			
		
			System.out.println("Qual é sua idade?");
			 idade = tlc.nextInt(); 
			
			System.out.println(nome + " tem "  + idade + " anos");
			
				
		
		}
		tlc.close();
		
		System.out.println("Acabou abestado");
	

	}

}
