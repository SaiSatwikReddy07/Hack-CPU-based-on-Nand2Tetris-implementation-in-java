public class And3input  {
	int out;
	
	public int and3input(int a, int b, int c) {
	   And AND = new And();
	   int t1 = AND.and(a, b);
	   int out = AND.and(t1,c);
	return out ;
		}
      /**public static void main(String[] args) {
 	And3input obj = new And3input();
 	int a = 0;
 	int b = 0;
 	int c = 1;
 	int out;
 	out= obj.and3input(a,b,c);
 	System.out.print(out);   
 }**/
}

