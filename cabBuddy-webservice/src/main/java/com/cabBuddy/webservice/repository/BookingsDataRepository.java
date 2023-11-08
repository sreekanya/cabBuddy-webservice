package com.cabBuddy.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabBuddy.webservice.entity.BookingsData;

@Repository
public interface BookingsDataRepository extends JpaRepository<BookingsData, Integer> {

}
