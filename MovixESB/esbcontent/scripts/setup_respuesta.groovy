import org.jboss.soa.esb.message.*

println "************ buscando respuesta ************"
println "respuesta: " + message.getBody().get().get("obtenerRespuestaResponse.return")
message.body.add("respuesta", message.getBody().get().get("obtenerRespuestaResponse.return"))