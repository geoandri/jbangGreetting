//usr/bin/env jbang "$0" "$@" ; exit $?
//REPOS xamdk=https://xam.dk/maven
//DEPS io.quarkus:quarkus-resteasy:999-SNAPSHOT

//JAVA_OPTIONS -Djava.util.logging.manager=org.jboss.logmanager.LogManager
//Q:CONFIG quarkus.swagger-ui.always-include=true

import io.quarkus.runtime.Quarkus;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello-resteasy")
@ApplicationScoped
public class GreetingResource {

    @GET
    public String sayHello() {
        return "Hello RESTEasy";
    }

    public static void main(String[] args) {
        Quarkus.run(args);
    }
}