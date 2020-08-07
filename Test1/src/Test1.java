import java.util.*;

public class Test1 implements Comparator<Test1> {

	int int1 = 1;
	int int2 = 2;
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();

	public int compare(Test1 d1, Test1 d2) {
		if (d1.equals(d2))
			return 0;
		else
			if (d1.compareTo(d2))
				return -1;
			else
				return 1;
	}

}
