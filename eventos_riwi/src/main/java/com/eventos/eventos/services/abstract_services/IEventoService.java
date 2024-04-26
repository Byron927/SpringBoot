package com.eventos.eventos.services.abstract_services;

import com.eventos.eventos.entities.Evento;

import java.util.List;

public interface IEventoService {
    //Entiendo para que necesitamos el objeto, no entiendo para que lo retorno
    public Evento guardar(Evento objEvento);
    public List<Evento> listarEventos();
    public Evento findById(String id);
    public Evento actualizar(Evento objEvento);
    public boolean eliminar(String id);
}
