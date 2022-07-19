package corejava_package;
final class a{}
public class finalkeyword extends a{
	final int speedlimit=90;
	void run() {
		speedlimit=400;
	}

	public static void main(String[] args) {
		finalkeyword obj=new finalkeyword();
		obj.run();

	}

}
