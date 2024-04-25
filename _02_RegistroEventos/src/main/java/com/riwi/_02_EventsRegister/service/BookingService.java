package com.riwi._02_EventsRegister.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.riwi._02_EventsRegister.entity.Booking;
import com.riwi._02_EventsRegister.service.abstract_services.IBookingService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class BookingService implements IBookingService {
    @Override
    public Booking save(Booking objBooking) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<Booking> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Booking getById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Booking update(Booking objBooking) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
