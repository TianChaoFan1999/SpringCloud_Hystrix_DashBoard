package com.tcf.cloud.hystrix.dashboard.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/***
 * TODO TCF Hystrix仪表盘启动类
 * @author 71485
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashBoardApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(HystrixDashBoardApplication.class,args);
	}
	
}
