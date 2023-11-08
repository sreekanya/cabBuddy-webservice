package com.cabBuddy.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabBuddy.webservice.entity.DriverData;

@Repository
public interface DriverDataRepository extends JpaRepository<DriverData, Integer> {

}
