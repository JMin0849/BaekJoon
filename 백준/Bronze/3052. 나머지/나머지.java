import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr= new int [10];
		int cnt=0;
		boolean bl;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= s.nextInt() % 42;
		}
		for(int i=0;i<arr.length;i++) {
			bl=false;
			for(int k= i+1;k<arr.length;k++) {
				if(arr[i]== arr[k]) {
					bl=true;
					break;
				}
			}
			if(bl == false)
				cnt++;
		}
		System.out.println(cnt);
	}
}