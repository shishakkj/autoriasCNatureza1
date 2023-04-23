import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sla = new Scanner(System.in);
	    System.out.println("Escolha uma fórmula para utilizar: \n[1] - Carga elétrica\n[2] - Campo elétrico");
	    int escolha = sla.nextInt();
	    if (escolha == 1){
	        cargaEletrica();
	    }
	    else if(escolha == 2){
	        campoEletrico();
	    }
	    else{
	        System.out.println("Por favor escolha um valor válido");
	    }
	}
	public static void cargaEletrica(){
	    Scanner sla = new Scanner(System.in);
	    System.out.println("Digite a quantidade de elétrons: ");
	    double n = sla.nextDouble();
	    double e = 1.6 * (Math.pow(10, -19));
	    double resultado = n * e;
	    System.out.println("O valor da carga elétrica é "+resultado);
	}
	
	public static void campoEletrico(){
	    Scanner sla = new Scanner(System.in);
	    System.out.println("Digite o valor da força elétrica: ");
	    double f = sla.nextDouble();
	    System.out.println("Digite o valor da carga elétrica: ");
	    double q = sla.nextDouble();
	    double resultado = f/q;
	    System.out.println("O valor do campo elétrico é "+resultado);
	}
}
	
