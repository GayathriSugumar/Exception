package ExceptionHandling.EventHandling;

public class EventHandling {
	
	public EventHandling() {
		System.out.println("Inside event Handling");
	}
	public void createEvent()throws Throwable{
		System.out.println("Inside create method");
		Throwable throwable=new Throwable();
		throw throwable;
	}
}
