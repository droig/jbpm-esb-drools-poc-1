package cl.movix.ws;

import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class MovixServices {

	@WebMethod()
	public String cobrar(
			@WebParam(name = "numero") 
				String numero
		) throws InterruptedException {

	    Random random = new Random();
	    
	    System.out.println("Servicio de cobro para el número: " + numero);
	    
	    //Thread.sleep(4000); 
	    
	    return (random.nextBoolean()) ? "si" : "no";
	}
	
	@WebMethod()
	public String enviarPregunta(
			@WebParam(name = "numero") 
				String numero
		) {
		System.out.println("Enviando pregunta....");
		
		String[] preguntas= {
				"pregunta 1",
				"pregunta 2",
				"pregunta 3"
				
		};
		
		Random random = new Random();
		return preguntas[random.nextInt(3)];
	} 
	
	@WebMethod()
	public String sumarPuntaje(
			@WebParam(name = "numero") 
				String numero
		) {
		System.out.println("Sumando puntaje...");
		return "100";
	}
	
	@WebMethod()
	public String reminder(
		@WebParam(name = "numero") 
			String numero
		) {
		System.out.println("Enviando reminder...");
		return "";
	}
	
	@WebMethod()
	public String obtenerRespuesta (
			@WebParam(name = "numero") String numero) {
		
		String[] respuestas = {
				null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null,
				"respuesta 1",
				"respuesta 2",
				"respuesta 3",
		};
		
		Random random = new Random();
		return respuestas[random.nextInt(33)];
		
	}
}
