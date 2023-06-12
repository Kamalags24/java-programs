public class findkey{
    public static int large(int n,int m,int o) {
        if(n>m && n>o){return n;}
        else if(m>n && m>o){return m;}
        else return o;
        
    }
    public static int small(int n,int m,int o) {
        if(n<m && n<o){return n;}
        else if(m<n && m<o){return m;}
        else return o;
        
    }
    public static int tho(int n) {
        return n/1000;
        
    }
    public static int hun(int n) {
        int c=n/100;
        return c%10;
            
    }
    public static int ten(int n) {
        int c=n/10;
        return c%10;
            
    }  public static int one(int n) {
        
        return n%10;
            
    }
    public static void main(String[] args) {
      int i1=3521,i2=2452,i3=1352;
    int t1=tho(i1),t2=tho(i2),t3=tho(i3),h1=hun(i1),h2=hun(i2),h3=hun(i3),d1=ten(i1),d2=ten(i2),d3=ten(i3),o1=one(i1),o2=one(i2),o3=one(i3);
    int thl=large(t1, t2, t3),ths=small(t1, t2, t3),hul=large(h1, h2, h3),hus=small(h1, h2, h3),del=large(d1, d2, d3),des=small(d1, d2, d3),onl=large(o1, o2, o3),ons=small(o1, o2, o3);
int h=(thl-ths),f=hul-hus,d=del-des,o=onl-ons;
System.out.println(h+""+f+""+d+""+o);
    }

} 