import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	double lado1;
	double lado2;
	double lado3;
	
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" Qual � o tamanho do primeiro lado do triangulo ? ");
	lado1 = leitor.nextDouble();
	System.out.println(" Qual � o tamnanho do segundo lado do triangulo ? ");
	lado2 = leitor.nextDouble();
	System.out.println(" Qual � o tamanho do terceiro lado do triangulo ? ");
	lado3 = leitor.nextDouble();
	
	if  (lado1 == lado2 && lado1 == lado3){
		
		System.out.println(" Seu triangulo � Equil�tero.");
	}
	
	else	
	
	if ( lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado2 != lado3)
		
	{
	System.out.println(" Seu triangulo � Is�celes.");	
	
	}
	else
		
	if (lado1 !=lado2 && lado2!=lado3 && lado1!=lado3)
		
	{
	
		System.out.println(" Seu triangulo � Escaleno. ");
	}
	 
	else {
		
	}	
	
	
	}

}
