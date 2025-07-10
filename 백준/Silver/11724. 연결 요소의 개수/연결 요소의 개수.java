import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main{
    static boolean visted[];
    static ArrayList<ArrayList<Integer>> A;

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visted = new boolean[n + 1];
        A = new ArrayList<>();

        for(int i=0;i<=n;i++){
            A.add(new ArrayList<Integer>());
        }

        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A.get(s).add(e);
            A.get(e).add(s);
        }

        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(!visted[i]){
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }

    public static void DFS(int v){
        if(visted[v]){
            return;
        }
        visted[v] = true;

        for(int i : A.get(v)){
            if(!visted[i]){
                DFS(i);
            }
        }

    } 
}