package cl.movic.action.ws;

import java.util.HashMap;

import org.jboss.soa.esb.actions.AbstractActionLifecycle;
import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

public class EnviarPreguntaMapper extends AbstractActionLifecycle {
	
	protected ConfigTree _config;

	public EnviarPreguntaMapper(ConfigTree config)
	   {
	      _config = config;
	   }

	/**
	 * @param message
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Process
	public Message process(Message message) {
		
		String msgBody = (String) message.getBody().get();
		
		HashMap requestMap = new HashMap();
		requestMap.put("enviarPregunta.numero", msgBody);
		
		message.getBody().add(requestMap);
		
		return message;
	}

}
