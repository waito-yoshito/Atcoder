import java.util.*;
import java.io.*;

class C{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        result = factorial(N);

        //input
        String[] array_one = br.readLine().split(" ");
        String[] array_two = br.readLine().split(" ");

        //for algorithm
        int[] factorial_array = new int[result];

        //algorithm


        //for output
        System.out.println(result);
      }
    }

    public static int dfs(int n){
      int result = 0;
      boolean[][] M = new boolean[n][n];

      

      return result;
    }

    public static int factorial(int n){
      if(n == 0){
        return 1;
      }
      return n * factorial(n - 1);
    }
}