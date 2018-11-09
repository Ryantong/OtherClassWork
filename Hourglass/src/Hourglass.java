
public class Hourglass {
	public static void main(String[] args) {
		int size = 10;
		System.out.println(base(size));
		System.out.println(topHalf(size));
	}
	public static String base(int numQuotes) {
		return "|" + repeat("\"", numQuotes) + "|";
	}
	public static String topHalf(int numColons) {
		int size = 10;
		String glue = "";
		for(int i = size - 2; i > 2; i-=2) {//i think it can only do even numbers
			glue += repeat(" ", size - i) + "\\" + repeat(":", i) + "/ \n";
		}
		return glue;
	}
	public static String repeat(String character, int times) {
		String total = "";
		for(int i = 0; i < times; i++) {
			total += character;
		}
		return total;
	}
}
