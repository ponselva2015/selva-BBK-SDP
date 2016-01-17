package helloworld1;

public class HelloWorldWithCommandLineArguments
{
public static void main(String[] args)
{
	//this program accepts coomand line arguements 
	// and displays the message to the console
	
	if(args.length>0) //check the array contains input
	{
		System.out.println("The sring at coomand line is  "+args[0]);
	}
	else
	{
		System.out.println("No command line string-from else part-Hello world");
	}
	
}
}
