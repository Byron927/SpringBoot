package com.eventos.eventos.repository;

//El repositorio se encarga de la persitencia de datos
//La interfaz es un contrato

import com.eventos.eventos.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoRepository extends JpaRepository<Evento, String>{
}
