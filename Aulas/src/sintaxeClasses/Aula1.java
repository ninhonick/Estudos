package sintaxeClasses;

import java.util.Scanner;

public class Aula1 {
   public static void main(String[] args) {
	System.out.println("vamos começar meus nobres!!!! ");
	
	Scanner tcl = new Scanner (System.in);
	
	System.out.println("digite seu nome!");	
	String nome = tcl.next();
	System.out.println("digite seu sobrenome!");
	String sobreNome = tcl.next();
	
	String nomeComplet = nomeCompleto(nome,sobreNome);
	
	System.out.println(nomeComplet);
	
	tcl.close();
	
	
}

 public static String nomeCompleto (String nome1, String nome2) {
	return nome1.concat(" ").concat(nome2);
}
}
