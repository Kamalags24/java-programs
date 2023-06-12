public class removechar {
    public static String remove(String i1,String i2) {
        String s="";
        char d=i2.charAt(0);
        for(int i=0;i<i1.length();i++){
            char p=i1.charAt(i);
            if(p!=d){
                s+=p;
            }
        }
        return s;
        

        
    }
    public static void main(String[] args) {
        System.out.println(remove("pakin basker", "a"));
    }
    
}
