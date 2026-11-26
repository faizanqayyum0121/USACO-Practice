/*
 * Problem: Speeding Ticket
 * Platform: USACO Guide
 * Status:
 * Date:11/25/2026
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] road = new int[2][n];
        int[][] drive = new int[2][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            road[0][i] = Integer.parseInt(st.nextToken());
            road[1][i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            drive[0][i] = Integer.parseInt(st.nextToken());
            drive[1][i] = Integer.parseInt(st.nextToken());
        }

        out.close();
    }
}