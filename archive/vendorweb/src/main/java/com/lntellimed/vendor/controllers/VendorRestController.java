package com.lntellimed.vendor.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lntellimed.vendor.entities.Vendor;
import com.lntellimed.vendor.service.VendorService;

@RestController
@RequestMapping("/vendors")
public class VendorRestController {
	
	@Autowired
	VendorService service;
	
	@GetMapping
	public List<Vendor> showVendors() {
		return service.getAllVendors();
	}
	
	@GetMapping("/{id}")
	public Vendor findVendor(@PathVariable("id") Integer id) {
		return service.getVendorById(id);
	}

	@PostMapping
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return service.saveVendor(vendor);
	}
	
	@PutMapping
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return service.saveVendor(vendor);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVendor(@PathVariable("id") int id) {
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendor(vendor);
	}

}