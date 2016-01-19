package helloworld1;

public class HelloWorldDecoupled
{
	// this is the application launcher logic
	public static void main(String[] args) {
		//create the object for message renderer
	    StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
	    //create the object for the message provider
	    HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
	    
	    //setting the message provider to the renderer 
	    //Set the message provider to the message render
	    mr.setMessageProvider(mp);
	    //calling the message renderer.
	    mr.render();
	}

}
