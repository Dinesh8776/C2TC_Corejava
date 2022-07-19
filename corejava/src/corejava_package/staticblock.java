package corejava_package;

public class staticblock {
	static int  a;
	static int b;
	static 
	{
		a=10;
        b=20;
        System.out.println("hi");
	}

	public static void main(String[] args) {
		System.out.println("welcome");
		System.out.println("value of a is " +a);
		System.out.println("value of b is " +b);
		

	}

}
