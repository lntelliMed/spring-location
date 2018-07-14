package com.lntellimed.location.service;

import java.util.List;

import com.lntellimed.location.entities.Location;

public interface LocationService {
	Location saveLocation(Location location);
	Location updateLocaton(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocations();
}
