package EstruturaWhile_pag46;
import java.util.*;


public class L03A {
	public static void main (String []args) {
		int i = 0;
		int cont = 1;
		int calc = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		i = sc.nextInt();
		
		 while (cont <= 10) {
			calc = cont * i;
			System.out.println(cont + "x" + i + "=" + calc);
			cont++;
		
		}

}
	
}
