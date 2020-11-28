package com.bridgelabz.code;

@FunctionalInterface
interface Name
{
	public void Operation(String name);
}

public class Lambda {
	
	Name nameo = (name) -> System.out.println("Name : "+name);
	public void Prints(String name)
	{
		nameo.Operation(name);
	}
	public static void main(String a[])
{
		Lambda l = new Lambda();
		String name = "Shubham";
		l.Prints(name);
}

}
