package Dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner tlc = new Scanner(System.in);
		float num1,num3;
		String operaçao ;
		
				
		
		System.out.println(" informe de qual número que você quer sua tabuada");
		num1 = tlc.nextInt();
		
		System.out.println("até quanto você que a sua tabuada ( de 0 á ? :");
		num3 = tlc.nextInt();
		
		System.out.println("Qual operação deseja realisar :  adição(+) / divisão(/) / multiplicação(*) / subtração(-) ?");
		operaçao = tlc.next();
		
		
		for (float i = 1;i <=num3; i++) {
			if (operaçao.equals("*")) {
			System.out.println(num1 +" x " + i +" = " + (num1 * i));
			} else if (operaçao.equals("+")) {
				System.out.println(num1 +" + " + i +" = " + (num1 + i));
				
			}else if (operaçao.equals("/")) {
				System.out.println(num1 +" / " + i +" = " + (num1 / i));
			}else {
				System.out.println(num1 + " - " + i +" = " +( num1 -= i)) ;
					}
				
			
		}
		tlc.close();
	}

}
