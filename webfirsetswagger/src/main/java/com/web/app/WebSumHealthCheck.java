package com.web.app;

import com.codahale.metrics.health.HealthCheck;

public class WebSumHealthCheck extends HealthCheck {
	@Override
	protected Result check() {
		return Result.healthy();
	}

}
