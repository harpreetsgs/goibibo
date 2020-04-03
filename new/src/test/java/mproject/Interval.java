package mproject;

interface InterA 
{
void printa();
}

interface InterB extends InterA
{
	void printb();
}

class Interval
{
	
	void printa()
	{
		System.out.println("A");
	}
	void printb()
	{
		System.out.println("B");
	}
	
	
	public static void main (String args[]) {
		Interval i=new Interval();
		i.printa();i.printb();
		
	}
}