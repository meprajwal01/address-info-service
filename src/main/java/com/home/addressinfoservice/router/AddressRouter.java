package com.home.addressinfoservice.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.home.addressinfoservice.handler.AddressHandler;

@Configuration
public class AddressRouter {

	@Bean
	public RouterFunction<ServerResponse> getAddressById(AddressHandler addressHandler){
		System.out.println("AddressRouter.getAddressById()");
		return RouterFunctions.route(RequestPredicates.GET("/address/{id}"), addressHandler::getAddressById);
	}
	
}
