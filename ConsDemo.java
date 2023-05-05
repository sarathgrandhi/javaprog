package oopsConcepts;

public class ConsDemo {
	public ConsDemo(int a, int b) {
		int c=a*b;
		System.out.println("result is:"+c);	
	}
	public ConsDemo(String x, String y) {		
		String z = x+y;
		System.out.println(z);
		 
	}
	public static void main(String[] args) {
		ConsDemo cd=new ConsDemo(8, 5);
		ConsDemo co= new ConsDemo("Mindq","Systems");
		

	}

}
