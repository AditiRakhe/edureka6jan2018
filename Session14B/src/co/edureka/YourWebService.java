package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/yourwebservice")
public class YourWebService {

	// Web Methods
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		String response = "Hello, This is a Plain Text !!";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String response = "<html><body><b>Hello, This is a Plain Text !!</b></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String response = "<?xml version='1.0'?><hello>Hello, This is a Plain Text !!</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String response = "{ 'name':'John', 'age':31, 'city':'New York' }";
		return response;
	}
	
}
