package Corejava;
//Write a java program for array
public class Arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a container which stores multiple values of same data type

		int a[] = new int[5]; //declares an arrays and allocate memory for the value
		a[0]= 2;
		a[1]= 4;
		a[2]= 2;
		a[3]= 9;
		a[4]= 12;
		
		int b[] = {1,4,3,5,7};
	
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
