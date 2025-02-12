public class OneDimensionalArray {
	
	public static void main(String[] args)
	{
		int a[] = new int[7];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		
		int length = a.length;
		System.out.println("The Length of Array is:" + length);
		
		for(int i = 2;i<a.length;i++)
		System.out.println(a[i]);
		
		for(int x:a)
		{
			System.out.println("The Output of Enhanced for loop is:" +x);
		}
	}

}