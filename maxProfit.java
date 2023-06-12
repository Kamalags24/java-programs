public class maxProfit {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int max=a[0];
        int profit=0;
        for (int j=1;j<a.length;j++ ) {
            int i=a[j];

            if(max>i){
                max=i;
                System.out.print(max);
            }
            else if (i-max>profit){
                profit=i-max;

            }
            
        }
        System.out.println();
        System.out.println(profit);

    }}