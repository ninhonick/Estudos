package Dio;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner (System.in);
		int  qtNotas = 0;
		float nota = 0, totalNota = 0;
		 
		
		 
		System.out.println("Quantas notas obtidas?: ");
		qtNotas = tcl.nextInt();
		int div = qtNotas;
		
		while( qtNotas > 0 ) {
			System.out.println("Digite a nota");
			nota = tcl.nextFloat();
			totalNota += nota;
			qtNotas--;
		}
		System.out.println( totalNota / div);
		
		tcl.close();
		
}
   
}