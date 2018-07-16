package com.lntellimed.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lntellimed.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
