
public class And  {
	int out;
	public int and(int a, int b) {
	   Nand NAND = new Nand();
	   out = NAND.nand(NAND.nand(a, b),NAND.nand(a, b));
	return out ;
		}
	
   /** public static void main(String[] args) {
	And obj = new And();
	int a = 1;
	int b = 1;
	int out;
	out= obj.and(a,b);
	System.out.print(out);
		  
	   
}**/
}

