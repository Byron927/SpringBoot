package com.eventos.eventos.services;

import com.eventos.eventos.entities.Evento;
import com.eventos.eventos.repository.IEventoRepository;
import com.eventos.eventos.services.abstract_services.IEventoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
//Estudiar
public class EventoService implements IEventoService {
    @Autowired
    private final IEventoRepository eventoRepository;

    @Override
    public Evento guardar(Evento objEvento) {
        return this.eventoRepository.save(objEvento);
    }

    @Override
    public List<Evento> listarEventos() {
        return this.eventoRepository.findAll() ;
    }

    @Override
    public Evento findById(String id) {
        return this.eventoRepository.findById(id).orElse(null);
    }

    @Override
    public Evento actualizar(Evento objEvento) {
        return this.eventoRepository.save(objEvento);
    }

    @Override
    public boolean eliminar(String id) {
        Evento objEvento = this.findById(id);
        if (objEvento != null){
            this.eventoRepository.delete(objEvento);
            return true;
        }
        return false;
    }
}
