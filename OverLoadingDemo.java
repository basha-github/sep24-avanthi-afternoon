
class Number{
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(float a,float b,float c) {
		System.out.println(a*10+b/2+c-12);
	}
	void add(String fname,String lname) {
		System.out.println(fname+ " "+lname);
	}
}



public class OverLoadingDemo {

	public static void main(String[] args) {
		Number number = new Number();
		
		number.add(100, 200);
		number.add(100, 200,300);
		number.add("Rajukumar", "Kanakala");

	}

}

