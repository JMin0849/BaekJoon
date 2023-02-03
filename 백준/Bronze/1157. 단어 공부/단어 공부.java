import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String st = s.next();
		int cnt=0;
		int [] al = new int[26];
		st = st.toLowerCase();
		for(int i=0;i<st.length();i++) {
			int index = st.charAt(i) - (int)'a';
			al[index]++;
		}
		int max=-1;
		char ch ='?';
		for(int i=0;i<al.length;i++) {
			if(max<al[i]) {
				max = al[i];
				ch = (char)(i+65);
			}
			else if(al[i] == max)
				ch ='?';
		}
		System.out.print(ch);
	}
}