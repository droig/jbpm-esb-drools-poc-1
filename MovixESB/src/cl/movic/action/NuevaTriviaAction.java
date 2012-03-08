package cl.movic.action;

import org.jboss.soa.esb.actions.annotation.BodyParam;
import org.jboss.soa.esb.actions.annotation.Process;
import org.jboss.soa.esb.actions.annotation.PropertyParam;
import org.jboss.soa.esb.http.HttpRequest;
import org.jboss.soa.esb.message.Message;

public class NuevaTriviaAction {

	public NuevaTriviaAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
//	@Process
//	public Message process(Message message) {
//		System.out.println("process");
//		System.out.println(message.getBody().get());
//		return message;
//	}
	
	@Process
    public String printHttpRequestInfo(Message message, @BodyParam String httpPayload, @PropertyParam HttpRequest requestInfo) {
		
		System.out.println("printHttpRequestInfo");
		message.getBody().add("numero", requestInfo.getPathInfo().replaceAll("[^0-9]", ""));
		System.out.println("end setup");
		
		return "Comenzando proceso con numero: " + requestInfo.getPathInfo().replaceAll("[^0-9]", "");
	}
	
}
