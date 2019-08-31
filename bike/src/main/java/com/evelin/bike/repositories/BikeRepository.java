package com.evelin.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evelin.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
