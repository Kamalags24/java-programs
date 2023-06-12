public class maxwater{
    public static int maxy(int[] a) {
        int ans=0;
        int l=0;
        int r=a.length-1;
for(int i=0;i<a.length;i++){
        
        int an=(r-l)*(Math.min(a[l], a[r]));
        
        if(an>ans){
            ans=an;
           
        }


        else if(l<r){
            l++;
        }
        else if(l>r){
            r--;
        }


        
    }
return ans;
}
    public static void main(String[] args) {


        int[] a={1,2,3,1,3,4};
        System.out.println(maxy(a));

    }
}