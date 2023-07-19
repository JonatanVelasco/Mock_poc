package co.com.bancolombia.graphqlapi;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

    @RequiredArgsConstructor
@Controller
/**
* To interact with the API make use of Playground in the "/playground" path, but remember,
* Playground ONLY must be used in dev or qa environments, not in production.
*/
public class ApiQueries implements GraphQLQueryResolver {

//  private final MyUseCase useCase;


    public String getSomething(String objRequest/* change for object request */) {
//      return useCase.doAction(objRequest);
        return "Hello world from graphql-api queries " + objRequest;
    }
}