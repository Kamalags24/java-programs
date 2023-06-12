public class countnum {
    public static int count(String s) {
        char[] c=s.toCharArray();
        int t=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='0' && c[i]<='9'){
                t++;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(count("gyh54ut457@fch"));
    }
}
