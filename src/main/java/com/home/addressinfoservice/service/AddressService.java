package com.home.addressinfoservice.service;

import org.springframework.stereotype.Service;

import com.home.addressinfoservice.model.Address;

import reactor.core.publisher.Mono;

@Service
public class AddressService {

	public Mono<Address> getAddressById(int id) {

		System.out.println("AddressService.getAddressById()");
		return Mono.just(new Address(id, "Name " + id));
	}

}
