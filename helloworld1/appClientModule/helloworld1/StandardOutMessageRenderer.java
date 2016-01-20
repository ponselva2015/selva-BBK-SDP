package helloworld1;

public class StandardOutMessageRenderer implements MessageRenderer {
	//Private variable of type provider object 
	//declared and set to null as this as an instance varibale
	  private HelloWorldMessageProvider messageProvider = null;
	  
	  
	  
	  public void setMessageProvider(MessageProvider provider)
	  {
		    this.messageProvider = (HelloWorldMessageProvider) provider;
		}
	  
	  public HelloWorldMessageProvider getMessageProvider()
	  //this is the getter method for others to get the vallue of  the message.
	  {
		    return this.messageProvider;
		}
	  
	  public void render() {
		    if (messageProvider == null) {
		      throw new RuntimeException(
		          "You must set the property messageProvider of class:"
		              + StandardOutMessageRenderer.class.getName());
		      
		}
		    System.out.println(messageProvider.getMessage());

	  }

 
}
