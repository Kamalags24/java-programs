public class shifitingarray{
    /*public static int[] shiftindex(int[] i2,int i3) {
        int a[]=new int[i2.length];
        int j=0;
        for(int i=i3;i<i2.length;i++){
            a[j++]=i2[i];

        }
        for(int i=0;i<i3;i++)
        {
            a[j++]=i2[i];
        }
        return a;
    }*/
    public static void main(String[] args) {
        int i2[]={1,2,3,4,5,6,7,8,9};
        int i3=2;
        int a[]=new int[i2.length];
        int j=0;
        for(int i=i3;i<i2.length;i++){
            a[j++]=i2[i];

        }
        for(int i=0;i<i3;i++)
        {
            a[j++]=i2[i];
        }
        for(int i=0;i<=a.length;i++){
        System.out.print(a[i]+" ");}
    }
}