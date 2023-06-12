public class trianglearea {
    public static double area(int a,int b,int c,int d) {
        double f=(a*b)/2;
        double g=(c*d)/2;
        if(f>g){
            return f;
        }
        else 
        return g;
        
    }
    public static void main(String[] args) {
        System.out.println(area(5,8,4,11));
    }
}
