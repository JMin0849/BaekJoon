import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String st = s.nextLine();
		st = st.trim();
		if(st.isEmpty())
			System.out.println("0");
		else
			System.out.println(st.split(" ").length);
	}
}