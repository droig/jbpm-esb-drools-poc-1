package cl.movic.action;

import org.jboss.soa.esb.actions.AbstractActionLifecycle;
import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

import cl.movic.bean.Pregunta;
import cl.movic.bean.Respuesta;

public class EvalAction extends AbstractActionLifecycle {
	
	protected ConfigTree _config;

	public EvalAction(ConfigTree config)
	   {
	      _config = config;
	   }

	/**
	 * @param message
	 */
	@Process
	public Message process(Message message) {
		
		String pregunta = (String) message.getBody().get("pregunta");
		String respuesta = (String) message.getBody().get("respuesta");
		
		Pregunta preguntaObj = new Pregunta();
		Respuesta respuestaObj = new Respuesta();
		
		preguntaObj.setPregunta(pregunta);
		respuestaObj.setRespuesta(respuesta);
		
		//System.out.println("+++++ ACtion:" + pregunta + ", " + respuesta);

		message.getBody().add("pregunta", preguntaObj);
		message.getBody().add("respuesta", respuestaObj);

		return message;
	}

}
