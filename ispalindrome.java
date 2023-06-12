class ispalindrome{

public static boolean ispali(String s) {
    String h=s,a="";
    int j=s.length();
    for(int i=j-1;i>=0;i--){
        char c=h.charAt(i);
        a+=c;
    }
   if(a.equals(s)){return true;}
   else{return false;}
   // System.out.println(a);
} 
public static void main(String[] args) {
//ispali("ajia");
    System.out.println(pal("amma"));
}
public static String pal(String s)
{
    int n=s.length();
    String d="",a=s;
    for(int i=n-1;i>=0;i--){
        char c=a.charAt(i);
        d+=c;
    }
    return d;
}
}