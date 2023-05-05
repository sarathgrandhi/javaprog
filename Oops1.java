package oopsConcepts;

public class Oops1 {
	int result;
	public void multimethod(int a,int b){
		result=a*b;
		System.out.println("Result of given two values is:"+result+ "--> This is method1");
		
	}
	public void multimethod(int x,String y) {
		System.out.println("This is method2");
	}

	public static void main(String[] args) {
		Oops1 op =new Oops1();
		op.multimethod(5, 2);
		op.multimethod(8, "Sarath");
	}

}
