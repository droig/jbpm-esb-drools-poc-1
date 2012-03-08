package cl.movic.bean;

import java.io.Serializable;

public class Respuesta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String respuesta;

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}
}
