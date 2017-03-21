import java.util.Scanner;


public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double excesso;
		double multa;
		double total;
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println(" Qual é o peso total dos peixes ? ");
		peso = leitor.nextDouble();
		
		if (peso > 50){
			
			
			excesso = (peso - 50)*4;
			multa = excesso;
			
			System.out.println(" Você está com excesso de peso e vai ter que pagar uma multa de :"+ multa);
			
			
		}else
		{
			
				System.out.println("Você não tem excesso de peso entao nao pagará multa");
		}
		
		
		
		
		
		
		
		
	}

}
