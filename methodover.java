package oopsConcepts;

public class methodover {
	public void methodOL(int x,int y) {
		System.out.println("This is method1");
		
	}
	public void methodOL(int a,String b){
		System.out.println("This is method2");
	}

	public static void main(String[] args) {
		methodover mo = new methodover();
		mo.methodOL(1,2);
		mo.methodOL(8, "Mindq");
		
		
		
		

	}

}
