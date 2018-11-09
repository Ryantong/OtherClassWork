import java.util.Arrays;

//contains main method and 5 other static methods
public class ArraysLab3 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {3,2,1};
		int[] arr3 = {2,4,6,8,10,12};
		System.out.println(Arrays.toString(sum(arr1, arr2)));
		System.out.println((Arrays.toString(append(arr1, 4))));
		System.out.println(Arrays.toString(remove(arr3, 3)));
		System.out.println(sumEven(arr3));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			 sum[i] = arr1[i] + arr2[i];
		}
		return sum;
	}
	public static int[] append(int[] arr, int num) {
		int n = arr.length;
		int[] newArr = new int[n+1];
		for(int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		newArr[n] = num;
		return newArr;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] newArr = new int[arr.length-1];
		for(int i = 0; i < newArr.length+1; i++) {
			if(i>idx) {
				newArr[i-1] = arr[i];
			}else if(i<idx) {
				newArr[i] = arr[i];
			}
		}
		return newArr;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		
	}
}
