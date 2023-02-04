import java.util.*;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static boolean check(){
		boolean [] check = new boolean[26];
		int prev=0;
		String st = s.next();
		for(int i=0;i<st.length();i++) {
			int now = st.charAt(i);
			
			if(prev != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else
					return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int cnt = 0;
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			if (check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}