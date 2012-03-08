import org.jboss.soa.esb.message.*
import cl.movic.bean.Pregunta
import cl.movic.bean.Respuesta
import cl.movic.bean.RespuestaCliente


esRespuestaCorrecta = message.body.get("esCorrecta")

println "La respuesta es: " + esRespuestaCorrecta

if (esRespuestaCorrecta == "si") {
	message.body.add("eval","si")
} else {
	message.body.add("eval","no")
}