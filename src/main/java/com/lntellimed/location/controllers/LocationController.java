package com.lntellimed.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lntellimed.location.entities.Location;
import com.lntellimed.location.service.LocationService;


@Controller
public class LocationController {
	
	@Autowired
	LocationService locationService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("locaton") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations (ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocations();
		System.out.println(locations);
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
