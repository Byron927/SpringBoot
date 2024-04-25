package com.riwi._02_EventsRegister.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "booking")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    // Cuando el id es Long el GenerationType será .IDENTITY,
    // pero si el id es String el GenerationType será .UUID
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private LocalDate date;
    private String location;
    private int capacity;
}
