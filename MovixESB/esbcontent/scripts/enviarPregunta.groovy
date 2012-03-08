import org.jboss.soa.esb.message.*

println "************ enviando mensaje a cliente ************"
message.body.add("pregunta", message.getBody().get().get("enviarPreguntaResponse.return"))