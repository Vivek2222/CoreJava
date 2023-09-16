package Corejava;

public class Multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a container which stores multiple values of same data type

	int a[][]= new int[2][3]; //declares an arrays and allocate memory for the value
	a[0][0]= 2;
	a[0][1]= 4;
	a[0][2]= 2;
	a[1][0]= 9;
	a[1][1]= 12;
	a[1][2]= 12;
	
	System.out.println(a[1][0]);
	System.out.println(a[1][2]);
	
	}
}
