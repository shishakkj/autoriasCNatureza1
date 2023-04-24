import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sla = new Scanner(System.in);
	    System.out.println("Digite o número de carbonos na sua cadeia principal: \n[1] - 1\n[2] - 2\n[3] - 3\n[4] - 4\n[5] - 5\n[6] - 6\n[7] - 7\n[8] - 8\n[9] - 9\n[10] - 10");
	    int escolha1 = sla.nextInt();
	    String numeroC = "";
	    if (escolha1 == 1){
	        numeroC = "Met";
	    }
	    else if (escolha1 == 2){
	        numeroC = "Et";
	    }
	    else if (escolha1 == 3){
	        numeroC = "Prop";
	    }
	    else if (escolha1 == 4){
	        numeroC = "But";
	    }
	    else if (escolha1 == 5){
	        numeroC = "Pent";
	    }
	    else if (escolha1 == 6){
	        numeroC = "Hex";
	    }
	    else if (escolha1 == 7){
	        numeroC = "Hept";
	    }
	    else if (escolha1 == 8){
	        numeroC = "Oct";
	    }
	    else if (escolha1 == 9){
	        numeroC = "Non";
	    }
	    else if (escolha1 == 10){
	        numeroC = "Dec";
	    }
	    else{
	        System.out.println("Por favor insira um valor válido.");
	    }
	    
	    System.out.println("\nDigite o tipo de ligações: \n[1] - Simples\n[2] - Dupla\n[3] - Tripla\n[4] - 2 duplas\n[5] - 3 duplas\n[6] - 2 triplas\n[7] - 3 triplas");
	    int escolha2 = sla.nextInt();
	    String tipoLigacao = "";
	    if (escolha2 == 1){
	        tipoLigacao = "an";
	    }
	    else if(escolha2 == 2){
	        tipoLigacao = "en";
	    }
	    else if(escolha2 == 3){
	        tipoLigacao = "in";
	    }
	    else if(escolha2 == 4){
	        tipoLigacao = "dien";
	    }
	    else if(escolha2 == 5){
	        tipoLigacao = "trien";
	    }
	    else if(escolha2 == 6){
	        tipoLigacao = "din";
	    }
	    else if(escolha2 == 7){
	        tipoLigacao = "trin";
	    }
	    else{
	        System.out.println("Por favor insira um valor válido.");
	    }
	    
	    System.out.println("\nDigite o grupo funcional: \n[1] - Hidrocarboneto\n[2] - Álcool\n[3] - Aldeido\n[4] - Ácido Carboxílico\n[5] - Cetona\n[6] - Amina\n[7] - Amida");
	    int escolha3 = sla.nextInt();
	    String grupo = "";
	    if (escolha3 == 1){
	        grupo = "o";
	    }
	    else if (escolha3 == 2){
	        grupo = "ol";
	    }
	    else if (escolha3 == 3){
	        grupo = "al";
	    }
	    else if (escolha3 == 4){
	        grupo = "óico";
	    }
	    else if (escolha3 == 5){
	        grupo = "ona";
	    }
	    else if (escolha3 == 6){
	        grupo = "amina";
	    }
	    else if (escolha3 == 7){
	        grupo = "amida";
	    }
	    else{
	        System.out.println("Por favor insira um valor válido.");
	    }
	    
	    System.out.println("\nSua cadeia é fechada?\n[1] - Sim \n[2] - Não");
	    int escolha4 = sla.nextInt();
	    String resultado = "" + numeroC + "" + tipoLigacao + "" + grupo+ "";
	    if(escolha4 == 1){
	        System.out.println("\nA nomenclatura é Ciclo " + resultado + ".");
	        }
	    else if(escolha4 == 2){
	        System.out.println("\nA nomenclatura é " + resultado + ".");
	        }
	    else {
	        System.out.println("Por favor insira um valor válido.");
	        }
	}
}
