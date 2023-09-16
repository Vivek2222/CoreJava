

public class Reversedemo {

	public static void main(String[] args) {

		String s = "Vivek";
		String t="";
				for (int i=s.length()-1; i>=0;i--)
				{
					t= t+ s.charAt(i);
				}
		System.out.println(s);		
		System.out.println(t);
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		
	}

}
