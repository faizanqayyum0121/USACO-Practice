/*
* Problem: Shell Game
* Platform: USACO Guide
* Status:
* Date:11/23/2026
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] swaps = new int[2][n];
        int[] guesses = new int[n];
        for(i = 0; i < n; i++ ){
            st = new StringTokenizer(br.readLine());
            swaps[0][i] = Integer.parseInt(st.nextToken());
            swaps[1][i] = Integer.parseInt(st.nextToken());
            guesses[i] = Integer.parseInt(st.nextToken());
        }

        out.close();
    }
}