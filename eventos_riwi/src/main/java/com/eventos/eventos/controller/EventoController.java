package com.eventos.eventos.controller;

import com.eventos.eventos.entities.Evento;
import com.eventos.eventos.services.abstract_services.IEventoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
//Estudiar restController
@RequestMapping("/api/v2/evento")
@AllArgsConstructor

public class EventoController {
    @Autowired
    private final IEventoService eventoService;

    //modificador de acceso (Encapsulamiento)
    @PostMapping
    public ResponseEntity<Evento>guardar(@RequestBody Evento objEvento){
        int capacidadEvento = objEvento.getCapacidad();
        LocalDate fecha = objEvento.getFecha();

        if (capacidadEvento < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        if (fecha.isBefore(LocalDate.now())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        return ResponseEntity.ok(this.eventoService.guardar(objEvento));
    }



    @GetMapping
    public ResponseEntity<List<Evento>>listarEventos(){
        List<Evento> listaDeEventos = this.eventoService.listarEventos();
        return ResponseEntity.ok(listaDeEventos);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Evento>buscarEventoEspecifico(@PathVariable String id){
        Evento objEvento = this.eventoService.findById(id);
        return ResponseEntity.ok(objEvento);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String>eliminarEvento(@PathVariable String id){
        Boolean validacion = this.eventoService.eliminar(id);
        if (validacion == true){
            return ResponseEntity.ok("Eliminado correctamente");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El evento con el ID " + id + " no ha sido encontrado");
        }
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Evento>actualizarEvento(@PathVariable String id, @RequestBody Evento objEvento){
        objEvento.setId(id);
        Evento evento = this.eventoService.actualizar(objEvento);
        return ResponseEntity.ok(evento);
    }
}
