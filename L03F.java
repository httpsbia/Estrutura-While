package EstruturaWhile_pag46;
import java.util.*;

public class L03F {
	public static void main (String []args) {
	int base = 0;
	int expo = 1;
	Scanner sc = new Scanner (System.in);
	
    System.out.println("Digite a base da potência: ");
    base = sc.nextInt();
    
    System.out.println("Digite o expoente da potência: ");
    expo = sc.nextInt();
    
    int cont = 0;
    int pot = 1;
    
	while (cont < expo) {
		pot = pot * base;
		cont++;
	}
	System.out.println(base + "^" + expo + "=" + pot);
	
	}
	
	
}
