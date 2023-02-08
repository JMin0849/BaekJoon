import java.util.*;

public class Main {
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
 
		int a = s.nextInt();
		int crossCnt=1;
		int prevSum=0;
		
		while(true) {
			if( a <= prevSum + crossCnt) {
				if(crossCnt % 2 == 1) {
					System.out.print((crossCnt - (a - prevSum - 1)) + "/" + (a - prevSum));
					break;
			}
				else {
					System.out.print((a - prevSum) + "/" + (crossCnt - (a - prevSum - 1)));
					break;
				}
			}
			else {
				prevSum+= crossCnt;
				crossCnt++;
			}
			
	}
}
}