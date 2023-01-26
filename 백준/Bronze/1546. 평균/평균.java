import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		int[] arr= new int [a];
		double max= 0;
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			sum +=((arr[i]/max)*100);
		}
		System.out.println(sum/arr.length);
	}
}