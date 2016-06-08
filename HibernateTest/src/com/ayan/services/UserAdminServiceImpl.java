package com.ayan.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/user")
public class UserAdminServiceImpl  {

	@GET
	@Path("/")
	public long createUser() {
		return 100;
	}

}
