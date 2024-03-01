package Program;
import java.util.Scanner;

public class Sequence_prg_withInput {

	public static void main(String[] args) {
		int s,r,t,p;
		Scanner k =new Scanner(System.in);
		System.out.println("input values : ");
		
		p=k.nextInt(); //Here the value of string type convert to the int type 
		r=k.nextInt();
		t=k.nextInt();
		
		s=p*r*t/100;
		
		System.out.println("Out put is : "+s);
		
	}

}
