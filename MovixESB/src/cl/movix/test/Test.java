package cl.movix.test;

import org.jboss.soa.esb.client.ServiceInvoker;
import org.jboss.soa.esb.listeners.message.MessageDeliverException;
import org.jboss.soa.esb.message.Message;
import org.jboss.soa.esb.message.format.MessageFactory;

public class Test {

	/**
	 * @param args
	 * @throws MessageDeliverException 
	 */
	public static void main(String[] args) throws MessageDeliverException {
		ServiceInvoker invoker = new ServiceInvoker("MovixSoapServices", "MovixSoapServices");
		Message message = MessageFactory.getInstance().getMessage();

		message.getBody().add("Hi there!");
		invoker.deliverAsync(message);
	}

}
