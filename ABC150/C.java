import java.util.*;
import java.io.*;

class C{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        result = factorial(N);

        String[] array_one = br.readLine().split(" ");
        String[] array_two = br.readLine().split(" ");

        int[] factorial_array = new int[result];



        System.out.println(result);
      }
    }

    public static int dfs(int n){
      int result = 0;
      Stack s = new Stack(n);
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

class Stack{
  int stack_size = 0;
  int sp = 0;
  Object stack[];

  static final int defalt = 100;
  
  Stack(){
    this(defalt);
  }

  Stack(int size){
    stack = new Object[size];
    stack_size = size;
    sp = 0;
  }

  public void clear(){
    Arrays.fill(stack, 0, sp, null);
    sp = 0;
  }

  public void push(Object x){
    if(sp >= stack_size){
      throw new IllegalStateException("stack overflow");
    }
    stack[sp++] = x;
  }

  public Object pop(){
    if(sp <= 0){
      throw new EmptyStackException();
    }
    Object value = stack[--sp];
    stack[sp] = null;
    return value;
  }

  public boolean isEmpty(){
    return sp == 0;
  }

}