import java.io.*;
import java.util.*;

class B{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[2]);

        String[] score = br.readLine().split(" ");
        int total = 0;

        for(int i = 0; i < N-1; i++){
          total += Integer.parseInt(score[i]);
        }

        int result = -1;

        for(int i = 0; i <= K; i++){
          if((total + i)/N >= M){
            result = i;
            break;
          }
        }

        System.out.println(result);
      }
    }
}
