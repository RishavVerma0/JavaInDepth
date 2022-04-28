package Assignment01;

// Delete element from array at particular index
public class Question08 {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = a.length;
		
		array obj = new array();
		obj.delete(a, n, 3);
		obj.print_array(a, n);
		
	}

}

class array 
{
	int i;
	int[] delete(int []a, int n, int index)
	{
		
		for(i = index + 1; i < n; i++)
		{
			a[i - 1] = a[i];
		}
		a[n - 1] = 0;
		return a;
	}
	
	void print_array(int []a ,int n)
	{
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}