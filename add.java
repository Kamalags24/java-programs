import java.util.Scannner;

public class reverse {
    public static int[] reverse(int[] input1, int input2) {
       int[] res=new int[input2];
    for(int i=0;i<input2;i++){
        res[i]=input1[--input2];
    }
    return res;
    }
       
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 	int input2 = s.nextInt();
	int[] input1 = new int[input2];
	for(int i=0;i<inpu2;i++){
	     input1[i] = s.nextInt();
	}
	System.out.println(reverse(input1,input2).toString());
       
    }
}
