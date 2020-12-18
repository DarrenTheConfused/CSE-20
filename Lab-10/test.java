
public class test {

	public static void main(String[] args) {
		int max = 10;
		int incr = 3;
		int num = 0;
		for (int i = 0; i < max; i *= incr) {
			num++;
		}
		System.out.println(num);

	}

}
