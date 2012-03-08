package cl.movic.bean;

import java.io.Serializable;

public class Pregunta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pregunta;

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}
}
