import java.util.Arrays;

public class Or16 {
	
		int[] out; 
		
		public int[] or16(int[] a, int[] b){
	        Or OR = new Or();
	        int[] out = new int[16];
	        for (int i=0; i<=15; i++) {
	        	out[i]= OR.or(a[i],b[i]);
	        }
	        return out;

}
		    /**public static void main(String[] args) {
				Or16 obj = new Or16();
				int a[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
		 	    int b[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1}; 
				int[] out = new int[16];
				out= obj.or16(a,b);
				System.out.print(Arrays.toString(out));
		 		  }**/
}
