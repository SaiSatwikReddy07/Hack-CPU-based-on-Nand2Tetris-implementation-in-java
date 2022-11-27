
public class Xor {
	int out,d,c,na,nb;
	
	public int xor(int a, int b) {
		Not NOT = new Not();
		And AND = new And();
		Or OR = new Or();
		
		na = NOT.not(a);
		nb = NOT.not(b);
		c = AND.and(na, b);
		d = AND.and(a,nb);
		out = OR.or(c, d);
	
		return(out);
	
	}
	    /** public static void main(String[] args) {
		Xor obj = new Xor();
		int a = 1;
		int b = 1;
		int out;
		out= obj.xor(a,b);
		System.out.print(out);
			  
		   
	}**/

}


