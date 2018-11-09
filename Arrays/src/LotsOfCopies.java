import java.util.Arrays;

public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num, strMain, arrMain);
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		part2();
	}
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str += str;
		arr[2] = 42;
	}
	public static void part2() {
		System.out.println("");
		System.out.println("Part 2");
		int a = 7;//a= startValue
		int b = a;//b=a
		a=1;      //a= newValue
		System.out.println("a: " + a);
		System.out.println("b: " + b);//end of ints
		
		String s = "part";//String
		String t = s;
		s= "two";
		System.out.println("s: " + s);
		System.out.println("t: " + t);//end String
		
		int[] array = {1,2,3};//begin array
		int[] ar = array;
		for(int i = 0; i < array.length; i++) {
			array[i]=0;
		}
		System.out.println("array: " + Arrays.toString(array));
		System.out.println("ar: " + Arrays.toString(ar));//end array
	}
}
