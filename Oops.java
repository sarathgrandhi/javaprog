package oopsConcepts;

public class Oops {
	public int result;  
	
	public void add(int a , int b) {
		result=a+b;
		System.out.println("Addition of given two values:"+result);
	}
	public void multiOf(int x, int y) {
		result=x*y;
		System.out.println("Multiplication of given two values:"+result);
	}

	public static void main(String[] args) {
		Oops op=new Oops();
		op.add(5, 6);
		op.multiOf(6, 2);

	}

}
