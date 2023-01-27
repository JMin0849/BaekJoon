import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			int[] arr = new int[a];
			
			double sum=0;
			for(int j=0;j<a;j++) {
				arr[j]= s.nextInt();
				sum+=arr[j];
			}
			
			double mean =(sum/a);
			double cnt=0;
			
			for(int j=0;j<a;j++) {
				if(arr[j]>mean)
					cnt++;
			}
			System.out.printf("%.3f%%\n", (cnt/a)*100);
			}
		}
	}