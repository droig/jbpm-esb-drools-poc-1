import org.jboss.soa.esb.message.*
import java.util.Date

date = new Date()
println date

diff = 1000 * 60;
date2 = new Date(date.getTime() + diff);

println date2

message.getBody().add("timeout", date2.getTime())
message.getBody().add("timeOutFlag", false)