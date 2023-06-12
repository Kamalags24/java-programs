import java.util.*;
public class replace0in {
    public static void main(String[] args) {
        int n=46370098;
        String s=Integer.toString(n);
        String s1="";
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i) == '0'){s1+="1";}
            else {s1+=s.charAt(i);}


        }
        System.out.println(s1);
    }
}
