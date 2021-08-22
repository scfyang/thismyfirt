package com.web.app;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class WebSumConfiguration extends Configuration {

	@JsonProperty("swagger")
	private SwaggerBundleConfiguration swagger;
	SwaggerBundleConfiguration getSwaggerBundleConfiguration() {
		return this.swagger;
	}
}
