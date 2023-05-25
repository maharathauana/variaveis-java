import java.util.Scanner;

public class Somar { 
	
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner  (System.in);
	
	 int somar1;
	 int somar2;
	 int resultado; 
	 
	 System.out.println("Digite o primeiro número");
	 
	 somar1 = sc.nextInt();
	 
	 System.out.println( "Digite o segundo número");
	 
	 somar2 = sc.nextInt();
	 resultado= somar1 + somar2;
	 System.out.println("O resultado da soma é:"+resultado);
	 
	 
	 	sc.close();

 }
 
 
 
 }
