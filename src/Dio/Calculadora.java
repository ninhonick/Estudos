package Dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner tlc = new Scanner(System.in);
		float num1,num3;
		String opera�ao ;
		
				
		
		System.out.println(" informe de qual n�mero que voc� quer sua tabuada");
		num1 = tlc.nextInt();
		
		System.out.println("at� quanto voc� que a sua tabuada ( de 0 � ? :");
		num3 = tlc.nextInt();
		
		System.out.println("Qual opera��o deseja realisar :  adi��o(+) / divis�o(/) / multiplica��o(*) / subtra��o(-) ?");
		opera�ao = tlc.next();
		
		
		for (float i = 1;i <=num3; i++) {
			if (opera�ao.equals("*")) {
			System.out.println(num1 +" x " + i +" = " + (num1 * i));
			} else if (opera�ao.equals("+")) {
				System.out.println(num1 +" + " + i +" = " + (num1 + i));
				
			}else if (opera�ao.equals("/")) {
				System.out.println(num1 +" / " + i +" = " + (num1 / i));
			}else {
				System.out.println(num1 + " - " + i +" = " +( num1 -= i)) ;
					}
				
			
		}
		tlc.close();
	}

}
