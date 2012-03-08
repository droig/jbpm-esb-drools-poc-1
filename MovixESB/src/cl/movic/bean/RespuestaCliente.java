package cl.movic.bean;

import java.io.Serializable;

public class RespuestaCliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pregunta;
	private String respuesta;
	private boolean esCorrecta;

	public RespuestaCliente(String pregunta, String respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.esCorrecta = false;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}

	public boolean isEsCorrecta() {
		return esCorrecta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}
}
