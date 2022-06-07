package EstruturaWhile_pag46;
import java.util.*;

public class L03E{
	public static void main (String []args) {
		int result = 1;
		int expo = 0;
		Scanner sc = new Scanner (System.in);
		
		while (expo <= 15) {
			
			System.out.println(" 3 elevado à " + expo + " = " + result);
			result = result* 3;
			expo++;	
		}		
	}
	}
