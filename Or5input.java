
public class Or5input {
int out;

      public int or5input(int a,int b,int c, int d, int e) {
    	  Or OR = new Or();
    	  int t1 = OR.or(a, b);
		  int t2 = OR.or(c, t1);
		  int t3 = OR.or(d, t2);
    	  int out = OR.or(t3, e);
    	  return out;
      }
      /**  public static void main(String[] args) {
    	Or5input obj = new Or5input();
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	int d = 1;
    	int e = 1;
    	int out;
    	out= obj.or5input(a,b,c,d,e);
    	System.out.print(out);   
    }**/
}


