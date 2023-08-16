package com.home.addressinfoservice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.home.addressinfoservice.model.Address;
import com.home.addressinfoservice.service.AddressService;

import reactor.core.publisher.Mono;

@Component
public class AddressHandler {

	@Autowired
	private AddressService addressService;

	public Mono<ServerResponse> getAddressById(ServerRequest serverRequest) {

		System.out.println("AddressHandler.getAddressById()");
		String sId = serverRequest.pathVariable("id");
		int id = Integer.parseInt(sId);

		Mono<Address> monoAddress = addressService.getAddressById(id);

		return ServerResponse.ok().contentType(MediaType.APPLICATION_NDJSON).body(monoAddress, Address.class);

	}

}
