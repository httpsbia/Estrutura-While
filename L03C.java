package EstruturaWhile_pag46;
import java.util.*;

public class L03C {
	public static void main (String []args) {
		int n = 1;
		int n2 = 0;
		Scanner sc = new Scanner (System.in);
		
		while (n<=500) {
			if (n%2== 0) {
				n2 += n;
				System.out.println(n);
			}
			n++;
		}
		System.out.println(n2);
			
	}

}
