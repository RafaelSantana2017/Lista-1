import java.util.Scanner;


public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double excesso;
		double multa;
		double total;
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println(" Qual � o peso total dos peixes ? ");
		peso = leitor.nextDouble();
		
		if (peso > 50){
			
			
			excesso = (peso - 50)*4;
			multa = excesso;
			
			System.out.println(" Voc� est� com excesso de peso e vai ter que pagar uma multa de :"+ multa);
			
			
		}else
		{
			
				System.out.println("Voc� n�o tem excesso de peso entao nao pagar� multa");
		}
		
		
		
		
		
		
		
		
	}

}
