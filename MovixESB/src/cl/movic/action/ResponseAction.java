package cl.movic.action;

import org.jboss.soa.esb.actions.AbstractActionPipelineProcessor;
import org.jboss.soa.esb.actions.ActionProcessingException;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

public class ResponseAction extends AbstractActionPipelineProcessor {
	protected ConfigTree _config;

	public ResponseAction(ConfigTree config) {
		_config = config;
	}

	public Message process(Message message) throws ActionProcessingException {
		
		@SuppressWarnings("unused")
		Object obj = message.getBody().get();
		
		return message;
	}
}
