public class palindrome {
    public static boolean palin(String s) {
String d="",l=s;
int j=s.length();
        for(int i=j;i<=s.length();i--){
            
            d+=s.charAt(i);
        }
        if(l==d){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
      String s="miminjkj";
      String d="",l=s;
int j=s.length();
        for(int i=j-1;i>=0;i--){
            char h=s.charAt(i);
            d+=h;
            
        }
       
      System.out.println(d);
    }
}
