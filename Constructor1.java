package oopsConcepts;

public class Constructor1 {
	public Constructor1(int a, int b){
		int c= a*b;
		System.out.println("The result of given two values is:"+c);
	}
	public Constructor1(String x, String y) {
		String z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Constructor1 cn= new Constructor1(5, 6);
		Constructor1 co = new Constructor1("Sarath", "Chandra");
		

	}

}
