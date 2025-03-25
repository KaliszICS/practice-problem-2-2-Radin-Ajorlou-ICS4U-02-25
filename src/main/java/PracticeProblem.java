public class PracticeProblem {

	public static void main(String args[]) {
		
	}


	public static void printIntArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public static int intSeqSearch(int[] array, int num) {

		for (int i = 0 ; i < array.length; i++){
			if (array[i] == num) {
				return i + 1;
			}
		}
		return array.length;

	}
	
	public static int intBinarySearch(int[] array, int num) {

		
		int left = 0;
		int right = array.length - 1;
		int middle; 
		int counter = 0;
		while (left <= right){
			counter++;
			middle = (left + right)/2;
			if (array[middle] == num){
				return counter;
			}
			if (array[middle] > num){
				right = middle - 1;
			}
			else if (array[middle] < num){
				left = middle + 1;
			}

		}

		return counter;
	}

	public static int[] compareSearch(int[] array, int num)
	{
		return new int[] {intSeqSearch(array, num), intBinarySearch(array, num)};
	}


	
	public static int[] compareStringSearch(String[] array, String thisString)
	{
		int[] compare = new int[2];
		int counter = 0;
		for (int i = 0 ; i < array.length; i++){
			counter++;
			if (array[i] == thisString){
				compare[0] = i + 1;
				break;
			}
		}
		compare[0] = counter;
		int left = 0;
		int right = array.length - 1;//check
		int middle; 
		counter = 0;
		while (left <= right){

			counter++;

			middle = (left + right)/2;
			int vs = array[middle].compareTo(thisString);
			if (vs == 0 ){
				compare[1] = counter;
				break;
			}
			if (vs > 0){
				right = middle - 1;
			}
			else if (vs < 0){
				left = middle + 1;
			} 

		}
		compare[1] = counter;
		return compare;
	}





	
}
