import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        try{
            escolha();
        } 
        catch(Exception e){
          System.out.print("\nPor favor digite um valor válido\n");
          escolha();
        }
	}
	
	public static void escolha(){
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
	        System.out.println("\nPor favor escolha uma opção válida\n");
	        escolha();
	    }
	}
	
	public static void cargaEletrica(){
	    Scanner sla = new Scanner(System.in);
	    try{
	    System.out.println("\nDigite a quantidade de elétrons: ");
	    double n = sla.nextDouble();
	    double e = 1.6 * (Math.pow(10, -19));
	    double resultado = n * e;
	    System.out.println("\nO valor da carga elétrica é "+resultado);
	    }
	    catch (Exception e){
	        System.out.println("\nPor favor digite um valor válido");
	        cargaEletrica();
	    }
	}
	
	public static void campoEletrico(){
	    Scanner sla = new Scanner(System.in);
	    try{
	    System.out.println("\nDigite o valor da força elétrica: ");
	    double f = sla.nextDouble();
	    System.out.println("\nDigite o valor da carga elétrica: ");
	    double q = sla.nextDouble();
	    double resultado = f/q;
	    System.out.println("\nO valor do campo elétrico é "+resultado);
	    }
	    catch (Exception e){
	        System.out.println("\nPor favor digite um valor válido");
	        campoEletrico();
	    }
	}
}
