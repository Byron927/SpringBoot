package com.eventos.eventos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "evento")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private int capacidad;
}
