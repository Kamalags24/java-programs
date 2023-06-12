import java.util.*;
public class bingo {
    public static int largepair(int n,String n1) {
        String s=String.valueOf(n1);
        
        String[] s1=s.split(" ");
        int l=s1.length;
        int[] k=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            k[i]=Integer.parseInt(s1[i]);
        }
        Arrays.sort(k);
        return k[l-1]+k[l-2];
        
    }
    public static void main(String[] args) {
        int n=5;
        String n1="7 9 -3 8 -6 -7 8 10";
        System.out.println(largepair(n, n1));
    }
}
