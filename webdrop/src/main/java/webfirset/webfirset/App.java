package webfirset.webfirset;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.simple.SimpleContainerFactory;



import webfirset.webfirset.restful.FirstMyResource;
import webfirset.webfirset.restful.FirstMyResource2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        URI baseUri=UriBuilder.fromUri("http://127.0.0.1/").port(9998).build();
        
        ResourceConfig config=new ResourceConfig(FirstMyResource.class,FirstMyResource2.class);
       
       
        SimpleContainerFactory.create(baseUri, config);
       
    }
}
