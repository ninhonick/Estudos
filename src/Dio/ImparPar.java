package Dio;

import java.util.Scanner;

public class ImparPar {

		
		public static void main(String[] args) {
			
			Scanner tcl = new Scanner (System.in);
			
			int nmr, qtPAR = 0 ;
			int qtIMP = 0;
			int count =1;
			int qtNum= 0;
			
			System.out.println("Qual a quatidade de n�meros para An�lise?");
			qtNum = tcl.nextInt() ;
			  
			do {
				System.out.println("----------------informe o numero---------------->>> "+ count);
				System.out.println("------------------------------------------------------------");
				nmr = tcl.nextInt();
				if (nmr % 2 == 0) {
					System.out.println("-> " +nmr + " � par.");
					qtPAR ++;
				}else {
					System.out.println("-> " +nmr + " � �mpar.");
					qtIMP ++;
				}
				count ++;
				 
			
			}while (count <= qtNum);
				
			System.out.println("------------------------------------------------------------");
			System.out.println(" total de numeros �mpares: "+ qtIMP + " e pares : "+ qtPAR);
			System.out.println("------------------------------------------------------------");
			 
			tcl.close();


	}

}
