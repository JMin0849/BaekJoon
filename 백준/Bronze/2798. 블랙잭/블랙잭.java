import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = Search(arr, n, m);
        System.out.println(result);
    }
    public static int Search(int[] arr, int n, int m){
            int result = 0;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        int tmp = arr[i]+ arr[j]+arr[k];
                    
                        if(m==tmp){
                            return tmp;
                        }
                        if(result<tmp && tmp < m){
                            result = tmp;
                        }
                    }
                }
            }
            return result;
        }
    

}