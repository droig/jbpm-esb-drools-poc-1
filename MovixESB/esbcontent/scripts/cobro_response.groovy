import org.jboss.soa.esb.message.*

println "************ PROCESO DE COBRO ************"

message.body.add("cobro", message.getBody().get().get("cobrarResponse.return"))

println "************ PROCESO DE COBRO ************"