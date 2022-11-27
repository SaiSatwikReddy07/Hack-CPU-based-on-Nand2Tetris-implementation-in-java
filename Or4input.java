
public class Or4input {
int out;

      public int or4input(int a,int b,int c, int d) {
    	  Or OR = new Or();
    	  int t1 = OR.or(a, b);
		  int t2 = OR.or(c, d);
    	  int out = OR.or(t1, t2);
    	  return out;
      }
     /** public static void main(String[] args) {
    	Or4input obj = new Or4input();
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	int d = 1;
    	int out;
    	out= obj.or4input(a,b,c,d);
    	System.out.print(out);   
    }**/
}

