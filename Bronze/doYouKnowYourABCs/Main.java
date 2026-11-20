import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            nums.add(Integer.parseInt(st.nextToken()));
        }
        nums.sort(null);
        int a = nums.get(0);
        int b = nums.get(1);
        int c = nums.get(nums.size()-1) - a - b;
        out.print(a + " " + b + " " + c);

        out.close();

    }
}