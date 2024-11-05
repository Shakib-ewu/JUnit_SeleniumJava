package AllTests;

public class ForEachLoop {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int[]array= {1,4,6,8,2,5};
		
		/*for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}*/
		
		int sum = 0;
		for(int i:array) {
			System.out.println(sum);
			sum+=i;
		}

	}

}
