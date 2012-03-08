package cl.movic.action;

import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.message.Message;

public class ObtenerRespuestaAction {

	public ObtenerRespuestaAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	@Process
	public Message process(Message message) {
		//ADD CUSTOM ACTION CODE HERE
		return message;
	}

}
