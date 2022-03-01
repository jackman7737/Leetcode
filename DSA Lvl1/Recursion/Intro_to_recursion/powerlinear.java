import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        int pl=power(x,n);
        System.out.println(pl);
        
    }

    public static int power(int x, int n){
        if(n==0){return 1;}
        int plnm1=power(x,n-1);
        int pl=x*plnm1;
        return pl;
    }

}

