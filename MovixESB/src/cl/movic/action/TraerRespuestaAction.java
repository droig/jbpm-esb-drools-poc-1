package cl.movic.action;

import java.util.HashMap;

import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.message.Message;

public class TraerRespuestaAction {

	public TraerRespuestaAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Process
	public Message process(Message message) {
		
		String msgBody = (String) message.getBody().get();
		
		HashMap requestMap = new HashMap();
		requestMap.put("obtenerRespuesta.numero", msgBody);
		
		message.getBody().add(requestMap);
		
		return message;
	}

}
