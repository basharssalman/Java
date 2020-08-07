import java.util.ArrayList;

public class Dis {
	public static void main(String[] args) {
		ArrayList<Double> list;
		ArrayList<Float> list12;
		list = new ArrayList<Double>();
		int i = 4;
		Integer n;
		n = i;
		list.add(5.5); // auto-boxing, instead of typing list.add(Double.valueOf(5.5));
		Double d = list.get(0); // unboxing, instead of typing Double d = list.get(0).doubleValue();
		System.out.println(list);
		System.out.println(d);
		
	}
}
