public class mintaget {
public static void main(String[] args) {
    int[] a={1,4,4};
    System.out.println(minc(a, 4));
}
public static int minc(int[] n,int t) {
    int l=0,r=0,s=0,ans=Integer.MAX_VALUE;
while(r<n.length){
    s+=n[r];
    if(s>=t){
        while(s>=t){
            s-=n[l];
            l++;
        }
        
ans=Math.min(ans, (r-l)+2);
    }
r++;
}
  return  ans;  
}
}
