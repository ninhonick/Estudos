package sintaxeClasses;

import java.util.Scanner;

public class looops {

	public static void main(String[] args) {
		Scanner tcl = new Scanner (System.in);
		int nota;
		 
		System.out.println("informe uma nota: ");
		nota = tcl.nextInt();
		while (nota < 0 | nota >10) {
			System.out.println("nota invalida.Digite novamente!!");
			
			nota = tcl.nextInt();
		}
		System.out.println("parabens você tem " + nota + " como nota atribuida");
		
		
	}

}

