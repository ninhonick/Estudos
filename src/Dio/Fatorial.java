package Dio;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner tcl = new Scanner (System.in);
		int num1 = 0 ;
		double fator1,fator2,num2;
		
		System.out.println("digite o numero para tiramos seu fatorial:");
		num1 = tcl.nextInt();
		
		num2 = num1;
		
		
		    System.out.println("----------------- temos a seguinte sequencia:---------------");
		    
		for(int i= (num1-1) ; i>1; i --) {
			
			fator1 = num2;
			fator2 = fator1 * i;
			num2 = fator2;
		
			System.out.println( fator1 + " x " + i +  " = " + fator1* i );
			System.out.println("------------------------------------------------------------");
		    
			 }
		
		    System.out.println("temos o fatorial de " +num1+ " IGUAL A :" + num2);
		    System.out.println("------------------------------------------------------------");
		    
		    tcl.close();

	}

}
