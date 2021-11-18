package javaPogrm;

public class GenericMethod {

	public static void main(String[] args) {
		DemoClass demo=new DemoClass();
		demo.<String>GenericsMethod(" java");
		demo.<Integer>GenericsMethod(25);
		
		// TODO Auto-generated method stub

	}

}
class DemoClass{
	public<T> void GenericsMethod(T data) {
		System.out.println("data passed" +data);
	}
}
