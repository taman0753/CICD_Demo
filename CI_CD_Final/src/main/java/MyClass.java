public class MyClass {
	private int n =10;
	public void f1(int n1)
	{
		n1=10;
	}
	public static void main(String[] args) {
		int n2=20;
		System.out.println("hello sonar");
		if(n2==10)
		{
			
			System.out.println("false");
		}
MyClass ob = new MyClass();
ob.f1(20);
	}

}