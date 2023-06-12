public class permutationofwords {
    public static void main(String[] args) {
        permutation("123");
    }
    public static void permutation(String s) {
        permutation("",s);
        
    }
    public static void permutation(String p,String s) {
        if(s.length()==0){
            System.out.println(p+s);
        }
        else{
            for(int i=0;i<s.length();i++){
                permutation(p+s.charAt(i),s.substring(0, i)+s.substring(i+1, s.length()));
            }
        }
    }
}
