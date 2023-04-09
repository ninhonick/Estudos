package Dio;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner (System.in);
		double numero ;
		int count = 0;
		double total = 0;
		double maior = 0;
		double notaMenor = 9.9;
		double media;
		
		
		do {

		    System.out.println("digite a nota");
		    numero = tcl.nextInt();
		    count++;
		    total += numero;
		    if (numero > maior) maior = numero;
		    if (numero <= notaMenor & numero != 10 )notaMenor = numero;
		    System.out.println("ate agora temos : maior nota "+maior+ " e somatorio das notas " +total);
		    
	    } while (count < 5 );
		
		
		media = total / count;
		
		System.out.println(" ------------------------------");
		
		System.out.println(" sua avaliação : ");
		System.out.println("nota maior "+ maior +  " e nota menor "+ notaMenor);
		System.out.println("sua media " + media);
		
		
		System.out.println("-------------------------------");
		
		tcl.close();
	

	}

}
