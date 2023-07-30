package com.login.EndPoint;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("")
public interface LoginEndpoint {
	
	@GET
	@Path("/safemate/login/key")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getAccessToken( @Context HttpServletRequest request);
	
	@GET
	@Path("/safemate/user/data")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getUserData( @Context HttpServletRequest request);
	
	
	

}
