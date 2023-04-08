package sintaxeClasses;

import java.util.Scanner;

public class impaPar {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner (System.in);
		
		int nmr, qtPAR = 0 ;
		int qtIMP = 0;
		int count =1;
		int qtNum= 0;
		
		System.out.println("Qual a quatidade de nnumeros para nálise?");
		qtNum = tcl.nextInt() ;
		  
		do {
			System.out.println("----------------informe o numero---------------->>> "+ count);
			System.out.println("------------------------------------------------------------");
			nmr = tcl.nextInt();
			if (nmr % 2 == 0) {
				System.out.println("-> " +nmr + " é par.");
				qtPAR ++;
			}else {
				System.out.println("-> " +nmr + " é ímpar.");
				qtIMP ++;
			}
			count ++;
			 
		
		}while (count <= qtNum);
			
		System.out.println("------------------------------------------------------------");
		System.out.println(" total de numeros ímpares: "+ qtIMP + " e pares : "+ qtPAR);
		System.out.println("------------------------------------------------------------");
		 
		tcl.close();

	}

}
