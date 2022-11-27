public class Not {
   int out;
   public int not(int in) {
	   Nand NAND = new Nand();
	   out =  NAND.nand(in, in);
   return(out);
   }
 /**public static void main(String[] args) {
	Not obj = new Not();
	int in = 0;
	int out;
	out= obj.not(in);
	System.out.print(out);
		  
	   
}**/
}


