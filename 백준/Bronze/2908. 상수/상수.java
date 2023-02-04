import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int a2 = (a%10)*100+(a/10%10)*10+(a/100);
		int b2 = (b%10)*100+(b/10%10)*10+(b/100);
		if(a2>b2)
			System.out.println(a2);
		else
			System.out.println(b2);
	}
}