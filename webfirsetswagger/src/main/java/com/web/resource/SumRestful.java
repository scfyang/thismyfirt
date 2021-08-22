package com.web.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Api(tags = "sum op restful")
@Path("/api/websimu/v1/sum")
@Produces(MediaType.APPLICATION_JSON)
public class SumRestful {

	Logger log = LoggerFactory.getLogger(SumRestful.class.getClass());

	@GET
	@ApiOperation(value = "sum1()", response = String.class)
	@Path("/sum1")
	public String sum1(@QueryParam("str1") String str1, @QueryParam("str2") String str2) {
		log.info("111------");
		return "{\"code:\":\"111\"}";
	}

}
