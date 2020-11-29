package exceptionhandling;

public class Student {
	private String name;
	private String idno;
	private boolean containsAlphabetsOnly(String str)
	{
		for(int i=0;i<str.length();i++)
		{
		int j = str.charAt(i);
		if(j < 65) return false;
		if(j > 125) return false;
		if(j > 91 && j < 96) return false;
	        }
		return true;

}
	Student(String name,String idno) throws StudentException
	{
	if(!containsAlphabetsOnly(name))
	throw new InvalidNameException("Invalid Name");

	int a = Integer.parseInt(idno.substring(0,4));
	if( a < 1995 || a > 2007) 
	throw new InvalidYearException("Invalid Id Year");

	int b = Integer.parseInt(idno.substring(8));
	if( b <= 0 || b > 999) 
	throw new InvalidNumberException("Invalid Student Number");

	this.name = name;
	this.idno = idno;
	}

}
