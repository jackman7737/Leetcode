import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        int plog=power(x,n);
        System.out.println(plog);
        
    }

    public static int power(int x, int n){
        if(n==0){

        return 1;
        }
        int plogb2=power(x,n/2);
        int plog=plogb2*plogb2;
        if(n%2==1){
            plog=x*plog;
        }
        return plog;
    }

}
