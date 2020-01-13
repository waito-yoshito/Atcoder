import java.util.*;
import java.io.*;

class C{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        String[] array_one = br.readLine().split(" ");
        String[] array_two = br.readLine().split(" ");
        
        result = factorial(N);

        System.out.println(result);
      }
    }

    public static int factorial(int n){
      if(n == 0){
        return 1;
      }
      return n * factorial(n - 1);
    }
}