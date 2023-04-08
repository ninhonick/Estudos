package sintaxeClasses;

import java.util.Scanner;

public class looops {

	public static void main(String[] args) {
		Scanner tcl = new Scanner (System.in);
		int nota = 0, qtNotas = 0,count = 0;
		 
		
		 
		System.out.println("Quantas notas obtidas?: ");
		qtNotas = tcl.nextInt();
		
		while(count < qtNotas) {
			System.out.println("informe uma nota: ");
			nota = tcl.nextInt();
			if (nota <0 || nota > 10 ) {
			 System.out.println("nota invalida.Digite novamente!!");
			 nota = tcl.nextInt();
			 
			 count ++
			 
			}
			 
		}
		
		
		
			
			
		
		System.out.println("parabens você tem ---> " + nota + " como nota atribuida");
		
		
	}

}

