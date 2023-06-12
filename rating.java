public class rating {
    public static char rate(int n) {
        if(n>30 && n<100){
            if(n>30 && n<=50){
                return 'D';
            }
           else if(n>50 && n<61){
            return 'c';
            }
            else if(n>60 && n<81){
                return 'B';
            }
            else return 'A';
        }
        else return 'F';
        
    }
    public static void main(String[] args) {
        System.out.println(rate(64));
    }
}
