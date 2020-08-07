
public class This {
	int a;
	int b;
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This t = new This();
		t.set(3, 4);
		System.out.println(t.a);
		System.out.println(t.b);
		

	}

}
