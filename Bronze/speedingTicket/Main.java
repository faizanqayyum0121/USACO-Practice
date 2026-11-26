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
        int maxOver = 0;
        int currentRoadLength = road[0][0];
        int currentRoadLimit = road[1][0];
        int lengthTraveled = 0;
        int segment = 0;
        for(int i = 0; i < m; i++){
            //If already finished section advance before moving on
            if(lengthTraveled == currentRoadLength){
                segment++;
                currentRoadLength += road[0][segment];
                currentRoadLimit = road[1][segment];
            }
            int bessieSpeed = drive[1][i];
            lengthTraveled += drive[0][i];

            if(bessieSpeed > currentRoadLimit){
                if((bessieSpeed-currentRoadLimit) > maxOver){
                    maxOver = bessieSpeed - currentRoadLimit;
                }
            }

            while(currentRoadLength < lengthTraveled){
                segment++;
                currentRoadLength += road[0][segment];
                currentRoadLimit = road[1][segment];
                if(bessieSpeed > currentRoadLimit){
                    if((bessieSpeed-currentRoadLimit) > maxOver){
                        maxOver = bessieSpeed - currentRoadLimit;
                    }
                }
            }
        }
        out.print(maxOver);
        out.close();
    }
}