package Unit01;

import java.lang.reflect.Array;

/*
 -Normally arrays are the collection of similar type of elements which has contiguous memory location.
 -Java array is an object which contains element of similar data type
 -We can store only a fixed number of elements in a java array
 -Size limit issue:
 			- We can store only the fixed size of elements in the array
 			- It doesn't grow its size at runtime
 			- To solve this problem, collection framework is used in java which grows automatically
 			
 -There are two types of array:-
   -Single dimensional array
   -Multidimensional array
   
-Declare an array in java 
  -DataType arrayRefvar[];
  OR
  -DataType[] arrayRefVar;
  OR
  -DataType []arrayRefVar;
  
  -Instantiation of an array in java:
   -arrayRefVar = new dataType[size];
   
 */
public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {

		// Declaration
		int array1[];

		int[] array2;
		int[] array3;

		// Cannot do it as we have not provide it any memory/space yet!
		// array1[0] = 1;

		array1 = new int[6]; // {1,2,3,4}

		// Assigning values to the java array
		for (int i = 0; i < array1.length; i++)// length is the property of array
			array1[i] = i;

		int array4[] = { 33, 3, 4, 5 };// declaration , instantiation and initialization

		// Passing array to method
		arrayAsParameter(array4);

		// Passing anonymous array in a method
		arrayAsParameter(new int[] { 33, 3, 4, 5 });

		// Returning Array from the method
		int[] array5 = arrayAsReturnType();

		// ArrayIndexOutOfBoundException
		int arr[] = { 50, 60, 70, 80 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Multidimensional array in java

		int[][] arr6 = new int[3][3];// 3row 3 column

		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
			System.out.println(arr6[i][j]);
		}
		int counter = 0;
		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
			counter++;
			arr6[i][j] = counter;
		}

		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
			System.out.println(arr6[i][j]);
		}

	}

	static void arrayAsParameter(int arr[]) {
		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
			System.out.println(arr[i]);
		}
	}

	static int[] arrayAsReturnType() {
		int array4[] = { 33, 3, 4, 5 };

		return array4;
	}

}
