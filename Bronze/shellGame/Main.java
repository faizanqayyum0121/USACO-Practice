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
        for(int i = 0; i < n; i++ ){
            st = new StringTokenizer(br.readLine());
            swaps[0][i] = (Integer.parseInt(st.nextToken()))-1;
            swaps[1][i] = (Integer.parseInt(st.nextToken()))-1;
            guesses[i] = (Integer.parseInt(st.nextToken()))-1;
        }


        int maxScore = Integer.MIN_VALUE;
        for(int j = 1; j < 4; j++) {
            int[] shells = {1, 2, 3};
            int shellPos = j;
            int score = 0;
            for (int i = 0; i < n; i++) {
                int temp = shells[swaps[0][i]];
                shells[swaps[0][i]] = shells[swaps[1][i]];
                shells[swaps[1][i]] = temp;
                if (shells[guesses[i]] == shellPos)
                    score++;
            }
            if (score > maxScore)
                maxScore = score;
            score = 0;
        }
        out.print(maxScore);

        out.close();
    }
}