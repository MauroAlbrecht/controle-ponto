package com.digitalinovation.controledeponto.controller.abstracts;

import com.digitalinovation.controledeponto.model.JornadaTrabalho;
import com.digitalinovation.controledeponto.service.abstracts.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;

@SuppressWarnings({"unchecked", "SpringJavaInjectionPointsAutowiringInspection"})
public abstract class AbstractController<E extends Serializable, S extends AbstractService> {

    @Autowired
    private S service;

    @PostMapping
    public E create(@RequestBody E entity) {
        return (E) service.save(entity);
    }

    @GetMapping
    public List<E> getList() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> getByID(@PathVariable("id") Long id) throws Throwable {
        E busca = (E) service.findById(id).orElseThrow(() -> new NoSuchElementException("Not found!"));
        return ResponseEntity.ok(busca);
    }

    @PutMapping
    public E update(@RequestBody E entidade) {
        return (E) service.save(entidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByID(@PathVariable("id") Long id) {
        try {
            service.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
