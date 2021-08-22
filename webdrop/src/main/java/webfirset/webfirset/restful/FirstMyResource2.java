package webfirset.webfirset.restful;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/name2")
public class FirstMyResource2 {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getName() {
		return "this is getName";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("zz/{from}")
	public String zhuanzhang(@PathParam("from") String from,@QueryParam("from2") String from2,
			@QueryParam("to1") String to,@QueryParam("num") int num) {
		//http://127.0.0.1:9998/name/zz/from?from2=11&to1=22&num=555
		System.out.printf("from=%s from2=%s to=%s num=%d  \n",from,from2,to,num);
		return String.format("from=%s from2=%s to=%s num=%d  \n",from,from2,to,num);
	}
	
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Path("zzpost/{from}")
	public String zhuanzhang2(@PathParam("from") String from,@FormParam("key1") String key1,
			@FormParam("key2") String key2) {
		
		System.out.printf("from=%s key1=%s key2=%s \n",from,key1,key2);
		return "this is getName";
	}
}
