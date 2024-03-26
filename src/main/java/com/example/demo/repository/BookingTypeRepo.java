package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookingType;

public interface BookingTypeRepo extends JpaRepository<BookingType, Integer> {

}
