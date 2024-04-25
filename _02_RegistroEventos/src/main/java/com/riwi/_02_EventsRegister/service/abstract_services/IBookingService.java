package com.riwi._02_EventsRegister.service.abstract_services;

import java.util.List;

import com.riwi._02_EventsRegister.entity.Booking;

public interface IBookingService {
    
    public Booking save(Booking objBooking);

    public List<Booking> getAll();

    public Booking getById(String id);

    public boolean delete(String id);

    public Booking update(Booking objBooking);
}
