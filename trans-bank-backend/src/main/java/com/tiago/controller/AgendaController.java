package com.tiago.controller;
import com.tiago.model.Agenda;
import com.tiago.repository.AgendaRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agendas")
@AllArgsConstructor
public class AgendaController {

    private final AgendaRepository agendaRepository;

    @GetMapping
    public List<Agenda> list() {
        return agendaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Agenda create(@RequestBody Agenda agenda) {        
        return agendaRepository.save(agenda);        
    }
}
