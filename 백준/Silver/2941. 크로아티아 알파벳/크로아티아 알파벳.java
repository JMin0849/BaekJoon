import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st = s.next();
		
		int cnt=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if( ch == 'c' && i < st.length() - 1) {
				if( st.charAt(i + 1) =='=') {
					i++;
				}
				else if( st.charAt(i + 1) == '-') {
					i++;
				}
				}
			else if( ch == 'd' && i < st.length() - 1) {
				if( st.charAt(i + 1) =='z' && i < st.length() - 2) {
					if( st.charAt(i + 2) == '=') {
						i+=2;
					}
				}
				else if( st.charAt(i + 1) == '-') {
					i++;
				}
				}
			else if( ch == 'l' && i< st.length() - 1) {
				if( st.charAt(i + 1) =='j') {
					i++;
				}
			}
			else if ( ch == 'n' && i< st.length() - 1) {
				if( st.charAt(i + 1) =='j') {
					i++;
				}
			}
			else if ( ch == 's' && i < st.length() -1) {
				if( st.charAt(i + 1) =='=') {
					i++;
				}
			}
			else if( ch =='z' && i< st.length() -1 ) {
				if( st.charAt(i + 1) =='=') {
					i++;
				}
			}
			cnt++;
			}
		System.out.println(cnt);
		}
			
	}