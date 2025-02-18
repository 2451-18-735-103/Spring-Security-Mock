package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Bus;
import com.service.BusService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ticketbookingapp")
public class BusController {

	@Autowired
	private BusService service;

	@PutMapping("/update/{busNo}/{noOfSeatsAvailable}")
	@PreAuthorize("hasRole('ADMIN')")
	public Bus updateBus(@PathVariable int busNo, @PathVariable int noOfSeatsAvailable) {
		return service.updateBus(busNo, noOfSeatsAvailable);
	}

	@GetMapping("/viewBusBySourceAndDestination/{source}/{destination}")
	@PreAuthorize("hasAnyRole('USER','ADMIN','MANAGER')")
	public Bus viewBusBySourceAndDestination(@PathVariable String source, @PathVariable String destination) {
		return service.viewBusBySourceAndDestination(source, destination);
	}

	@GetMapping("/viewAllBusRating")
	@PreAuthorize("hasRole('MANAGER')")
	public List<Bus> viewAllBusRating() {
		return service.viewAllBusRating();
	}

	@PutMapping("/rating/{busNo}/{rating}")
	@PreAuthorize("hasRole('USER')")
	public Bus provideRating(@PathVariable int busNo, @PathVariable int rating) {
		return service.provideRating(busNo, rating);
	}
}