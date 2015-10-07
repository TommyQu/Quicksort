import java.util.Random;

public class MainFunction {
	
	public static void main(String[] args) {
		int[] array = new int[1000];
		int[] arrayB = new int[1000];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(5000);
			arrayB[i] = random.nextInt(5000);
		}
		
		QuickSortRecursion quickSortRecursion = new QuickSortRecursion();
		quickSortRecursion.sort(array, 0, array.length - 1);

		QuickSortWithoutRecursion quickSortWithoutRecursion = new QuickSortWithoutRecursion();
		quickSortWithoutRecursion.sort(arrayB, 0, arrayB.length - 1);;

		for (int i = 0; i < array.length; i++) {
			System.out.println("With:"+array[i]);
		}
		System.out.println("");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Without:"+arrayB[i]);
		}
	}

}

<<<<<<< HEAD
//wo yao test
=======

//another test

>>>>>>> Test_branch
>>>>>>> Another-test
