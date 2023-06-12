//import java.io.*;
import java.util.*;

//import java.util.Scanner;
public class coordinates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt(), b=sc.nextInt();
        coordins(a,b);
        sc.close();
    }
    public static void coordins(int a, int b) {
        if(a>0 && b>0){System.out.println("qudrant 1");}
        else if(a<0 && b>0){System.out.println("qudrant 2");}
        else if(a<0 && b<0){System.out.println("qudrant 3");}
        else if(a>0 && b<0){System.out.println("qudrant 4");}
        else if(a==0 &&b==0){System.out.println("orgin");}
        else if(a!=0 && b==0){System.out.println("x-axis");}
        else if(a==0 && b!=0){System.out.println("y-axis");}

        
    }
}
