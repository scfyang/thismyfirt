package com.web.app;

import com.web.resource.SumRestful;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class WebSumApplication extends Application<WebSumConfiguration> {

	@Override
	public String getName() {
		return "sumop";
	}

	@Override
	public void initialize(Bootstrap<WebSumConfiguration> bootstrap) {
		bootstrap.addBundle(new SwaggerBundle<WebSumConfiguration>() {

			@Override
			protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(WebSumConfiguration arg0) {
				return arg0.getSwaggerBundleConfiguration();
			}

		});

	}

	@Override
	public void run(WebSumConfiguration webSumConfiguration, Environment environment) throws Exception {
		environment.jersey().register(SumRestful.class);
		environment.healthChecks().register(getName(),new  WebSumHealthCheck());

	}
	
	public static void main(String[] args) {
		try {
			new WebSumApplication().run(args);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
