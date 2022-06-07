package EstruturaWhile_pag46;
import java.util.*;

public class L03B {
	public static void main(String []args) {
		int n = 0;
		int n2 = 0;
		Scanner sc = new Scanner (System.in);
		
		
		
		while (n <= 100) {
			n2 = n2+n;
			System.out.println(n);
			n++;
		}
		System.out.println(n2);
	}

}
