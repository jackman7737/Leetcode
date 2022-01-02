import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn= new Scanner(System.in);
      int n=scn.nextInt();
      int first=0;
      int second=1;
   
      for(int i=0;i<n;i++){
          System.out.println(first);
           int next=first+second;
         
          first=second;
          second=next;
      }
      

   }
  }
