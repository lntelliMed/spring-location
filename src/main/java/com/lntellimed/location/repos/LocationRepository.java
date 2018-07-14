package com.lntellimed.location.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.lntellimed.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
