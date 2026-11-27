/*
 * Problem: Mixing Milk
 * Platform: USACO Guide
 * Status: Accepted
 * Date:11/24/2026
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);



        List<Long> maxes = new ArrayList<>();
        List<Long> buckets = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            maxes.add(Long.parseLong(st.nextToken()));
            buckets.add(Long.parseLong(st.nextToken()));
        }
        int curr = 0;
        int next = 1;
        for(int i = 0; i < 100; i++){
            if(next == 3){
                next = 0;
            }
            if(curr == 3){
                curr = 0;
            }
            long max = maxes.get(next) - buckets.get(next);
            long pourable = buckets.get(curr);
            long poured = Math.min(pourable, max);
            //Take the lower of what you are able to pour and the room for you to pour
            buckets.set(curr, pourable-poured);
            buckets.set(next, buckets.get(next)+poured);
            curr++;
            next++;
        }
        out.println(buckets.get(0));
        out.println(buckets.get(1));
        out.println(buckets.get(2));
        out.close();
    }
}