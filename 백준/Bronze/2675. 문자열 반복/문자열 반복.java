import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		for(int i =0;i<n;i++) {
			int a =s.nextInt();
			String st = s.next();
			String sum="";
			
			for(int j=0; j<st.length();j++) {
				for(int k=0;k<a;k++) {
					sum += st.charAt(j);
				}
			}
			System.out.println(sum);
		}
	}
}