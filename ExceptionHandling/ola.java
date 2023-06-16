package ExceptionHandling;

public class ola {
	static void ride() throws olaException
	{
		int seat=5;
		if(seat<=4)
		{
			System.out.println("safe ride");
		
		}else{
			throw new olaException("last ride");
		
		}
		
	}
public static void main(String[] args) {
	try{
		ride();
	}
	catch(olaException e){
		System.out.println(e.getMessage());
	}
}
}
class olaException extends Exception
{
	String msg;
olaException(String msg)
{
	this.msg=msg;
}
public String getMessage()
{
	return msg;
}
}
