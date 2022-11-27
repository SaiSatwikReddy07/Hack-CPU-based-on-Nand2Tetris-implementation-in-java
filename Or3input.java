
public class Or3input {
int out;

      public int or3input(int a,int b,int c) {
    	  Or OR = new Or();
    	  int t1 = OR.or(a, b);
    	  int out = OR.or(t1, c);
    	  return out;
      }
     /**  public static void main(String[] args) {
  	Or3input obj = new Or3input();
  	int a = 0;
  	int b = 0;
  	int c = 0;
  	int out;
  	out= obj.or3input(a,b,c);
  	System.out.print(out);   
  }**/
}


