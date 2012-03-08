package cl.movic.action;

import java.util.HashMap;

import org.jboss.soa.esb.actions.AbstractActionLifecycle;
import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

public class RequestMapper extends AbstractActionLifecycle {
	
	protected ConfigTree _config;

	public RequestMapper(ConfigTree config)
	   {
	      _config = config;
	   }

	/**
	 * @param message
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Process
	public Message process(Message message) {
		
		//System.out.println(message.getBody().get());
		
		String msgBody = (String) message.getBody().get();
		
		HashMap requestMap = new HashMap();
		
		// add paramaters to the web service request map
		requestMap.put("cobrar.numero", msgBody);
		
		message.getBody().add(requestMap);
	    System.out.println("Request map is: " + requestMap.toString());
		
		return message;
	}

}
