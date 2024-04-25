package com.riwi._02_EventsRegister.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi._02_EventsRegister.entity.Booking;

public interface IBookingRepository extends JpaRepository<Booking, String> {

}
