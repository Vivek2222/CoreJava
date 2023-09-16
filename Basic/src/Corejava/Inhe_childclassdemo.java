package Corejava;

public class Inhe_childclassdemo extends Inhe_Parentclassdemo{
	
	public void engine()
	{
		System.out.println("New engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inhe_childclassdemo cd=new Inhe_childclassdemo();
		cd.colour();
		cd.breakes();
	}

}
